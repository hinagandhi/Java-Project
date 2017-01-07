/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chart;
import Business.Person.Person;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.Color;
import javafx.application.Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.TextAnchor;
/**
 *
 * @author test
 */
public class ChartRespiratory extends ApplicationFrame{
    private String chartTitle;
   private HospitalWorkRequest workRequest;
   private TimeSeries series2;
    public ChartRespiratory( final String applicationTitle , String chartTitle ,HospitalWorkRequest workRequest ) { 
        super(applicationTitle);
        repaint();
      series2 = new TimeSeries( "Respiratory Rate" ); 
        this.workRequest = workRequest;
       this.chartTitle = chartTitle;
    
final XYDataset dataset2 =  createDatasetRespiratoryRate(workRequest );
final JFreeChart chart2 = createChart( dataset2 );
final XYPlot plot = chart2.getXYPlot();
         HospitalWorkRequest hos1 = (HospitalWorkRequest) workRequest;
         int age = hos1.getPerson().getAge();
         int a = hos1.getPerson().getAboveRespirationRateMarker(age);
         int b = hos1.getPerson().getBelowRespirationRateMarker(age);
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
final ChartPanel chartPanel = new ChartPanel( chart2 ); 
chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 370 ) ); 
chartPanel.setMouseZoomable( true , false ); 
setContentPane( chartPanel );
getContentPane().repaint();
    }
    private JFreeChart createChart( final XYDataset dataset ) { 
        return ChartFactory.createTimeSeriesChart( "Respiratory Rate", "Seconds",
          "Value", dataset, false, false, false );  
            }
            public XYDataset createDatasetRespiratoryRate(HospitalWorkRequest workRequest)
  {
     // this.workRequest = workRequest;
      HospitalWorkRequest hos = (HospitalWorkRequest) workRequest;
  Second current3 = new Second( );
  
    Person p = hos.getPatient().getPerson();
        
        p = p.generateRandomVitalSign(p);
        series2.addOrUpdate(current3,p.getVitalSign().getRespiratoryrate());         
  return new TimeSeriesCollection(series2);
  }
             

}
