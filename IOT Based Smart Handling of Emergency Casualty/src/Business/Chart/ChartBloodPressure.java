/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chart;
import Business.Person.Person;
import Business.WorkQueue.HospitalWorkRequest;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart; import org.jfree.ui.ApplicationFrame; 
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.TextAnchor;
/**
 *
 * @author test
 */
public class ChartBloodPressure extends ApplicationFrame{
    private String chartTitle;
   private HospitalWorkRequest workRequest;
   private TimeSeries series6;
    public ChartBloodPressure( final String applicationTitle , String chartTitle ,HospitalWorkRequest workRequest ) { 
        super(applicationTitle);
      series6 = new TimeSeries( "Blood Pressure" ); 
        this.workRequest = workRequest;
       this.chartTitle = chartTitle;
    
final XYDataset dataset6 =  createDatasetBloodPressure(workRequest );
final JFreeChart chart6 = createChart( dataset6 );
//final XYDataset dataset1 =  createDatasetBloodPressure(workRequest );
//final JFreeChart chart1 = createChart1( dataset1 );
final XYPlot plot = chart6.getXYPlot();
         HospitalWorkRequest hos1 = (HospitalWorkRequest) workRequest;
         int age = hos1.getPerson().getAge();
         int a = hos1.getPerson().getAboveBPMarker(age);
         int b = hos1.getPerson().getBelowBPMarker(age);
        ValueMarker valueMarker = new ValueMarker(a);
        valueMarker.setLabel("ALERT");
        valueMarker.setLabelTextAnchor(TextAnchor.TOP_CENTER);
        valueMarker.setPaint(Color.blue);
         ValueMarker valueMarker1 = new ValueMarker(b);
        valueMarker1.setLabel("ALERT");
        valueMarker1.setLabelTextAnchor(TextAnchor.TOP_CENTER);
        valueMarker1.setPaint(Color.BLUE);
        plot.addRangeMarker(valueMarker);
        plot.addRangeMarker(valueMarker1);
//ChartFrame frame = new ChartFrame("series chart", chart);
  //      frame.setVisible(true);
   //     frame.setSize(450, 350);
final ChartPanel chartPanel6 = new ChartPanel( chart6 ); 
chartPanel6.setPreferredSize( new java.awt.Dimension( 560 , 370 ) ); 
chartPanel6.setMouseZoomable( true , false ); 
setContentPane( chartPanel6 );
getContentPane().repaint();
    }
    private JFreeChart createChart( XYDataset dataset ) { 
        return ChartFactory.createTimeSeriesChart( "Blood Pressure", "Seconds",
          "Value", dataset, false, false, false );  
            }
            public XYDataset createDatasetBloodPressure(HospitalWorkRequest workRequest)
  {
     // this.workRequest = workRequest;
      HospitalWorkRequest hos = (HospitalWorkRequest) workRequest;
  Second current6 = new Second( );
  
    Person p = hos.getPatient().getPerson();
        
        p = p.generateRandomVitalSign(p);
        series6.addOrUpdate(current6,p.getVitalSign().getHeartrate());         
  return new TimeSeriesCollection(series6);
  }
             

}
