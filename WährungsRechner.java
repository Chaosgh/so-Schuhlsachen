package easydatatype;

import javax.swing.JOptionPane;

public class W�hrungsRechner {

    public static void main(String[] args) { //array f�r den options dialog wird erstellt
        String[] options = {"EURO", "DOLLAR", "YEN", "BTC"};
        
      //anfangs option Pane wird erstellt
        int anfang = JOptionPane.showOptionDialog(null, "W�hle eine W�hrung, die in Dollar angezeigt werden soll:", 
                "W�hrungsumrechnung", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); //die optionen wird hier vom options array genommen
        	//maybe switchcase rein 
        if (anfang == 0) {  //beim schlie�en der conveter gibts nullpointer juck mich aber nicht 
          //f�r euro zu dollar
            String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den Betrag in Euro ein:");
            double euro = Double.parseDouble(eingabe);
            double ergebnis = euro * 1.06;
            
            
            JOptionPane.showMessageDialog(null, "Die Summe ist " + ergebnis + " Dollar");
        } else if (anfang == 1) {
        	//f�r komische leute
   
            JOptionPane.showMessageDialog(null, "Bist du dumm?");
        } else if(anfang == 2) {
        
        //f�r yen zu dollar
        	 String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den Betrag in YEN ein:");
        	 double YEN = Double.parseDouble(eingabe);
             double ergebnis = YEN * 0.0067;
             JOptionPane.showMessageDialog(null, "Die Summe ist " + ergebnis + " Dollar");
        
        }
        	 else if(anfang == 3) {
        	        //f�r btc zu dollar
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

