package easydatatype;

import javax.swing.JOptionPane;

public class WährungsRechner {

    public static void main(String[] args) { //array für den options dialog wird erstellt
        String[] options = {"EURO", "DOLLAR", "YEN", "BTC"};
        
      //anfangs option Pane wird erstellt
        int anfang = JOptionPane.showOptionDialog(null, "Wähle eine Währung, die in Dollar angezeigt werden soll:", 
                "Währungsumrechnung", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); //die optionen wird hier vom options array genommen
        	//maybe switchcase rein 
        if (anfang == 0) {  //beim schließen der conveter gibts nullpointer juck mich aber nicht 
          //für euro zu dollar
            String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den Betrag in Euro ein:");
            double euro = Double.parseDouble(eingabe);
            double ergebnis = euro * 1.06;
            
            
            JOptionPane.showMessageDialog(null, "Die Summe ist " + ergebnis + " Dollar");
        } else if (anfang == 1) {
        	//für komische leute
   
            JOptionPane.showMessageDialog(null, "Bist du dumm?");
        } else if(anfang == 2) {
        
        //für yen zu dollar
        	 String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den Betrag in YEN ein:");
        	 double YEN = Double.parseDouble(eingabe);
             double ergebnis = YEN * 0.0067;
             JOptionPane.showMessageDialog(null, "Die Summe ist " + ergebnis + " Dollar");
        
        }
        	 else if(anfang == 3) {
        	        //für btc zu dollar
        		 String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den Betrag in Bitcoin ein:");    
        		 double BTC = Double.parseDouble(eingabe);
                 double ergebnis = BTC * 29268.20;
                 JOptionPane.showMessageDialog(null, "Die Summe ist " + ergebnis + " Dollar");
        	        
        	 }      
        	        
        	       
   
                
             else {
              //gegen nullpointer oder so
                JOptionPane.showMessageDialog(null, " Debug Null");
            }
        }
    }

