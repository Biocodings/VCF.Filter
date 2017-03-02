/*
*     This file is part of the VCF.Filter project (https://biomedical-sequencing.at/VCFFilter/).
*     VCF.Filter permits graphical filtering of VCF files on cutom annotations and standard VCF fields, pedigree analysis, and cohort searches.
* %%
*     Copyright © 2016, 2017  Heiko Müller (hmueller@cemm.oeaw.ac.at)
* %%
* 
*     VCF.Filter is free software: you can redistribute it and/or modify
*     it under the terms of the GNU General Public License as published by
*     the Free Software Foundation, either version 3 of the License, or
*     (at your option) any later version.
* 
*     This program is distributed in the hope that it will be useful,
*     but WITHOUT ANY WARRANTY; without even the implied warranty of
*     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*     GNU General Public License for more details.
* 
*     You should have received a copy of the GNU General Public License
*     along with VCF.Filter.  If not, see <http://www.gnu.org/licenses/>.
* 
*     VCF.Filter  Copyright © 2016, 2017  Heiko Müller (hmueller@cemm.oeaw.ac.at)
*     This program comes with ABSOLUTELY NO WARRANTY;
*     This is free software, and you are welcome to redistribute it
*     under certain conditions; 
*     For details interrogate the About section in the File menu. 
*/
package at.ac.oeaw.cemm.bsf.vcffilter.noprefsstartup;

import at.ac.oeaw.cemm.bsf.vcffilter.VCFFilter;
import at.ac.oeaw.cemm.bsf.vcffilter.Warning;
import at.ac.oeaw.cemm.bsf.vcffilter.filter.ExampleFileFilter;
import at.ac.oeaw.cemm.bsf.vcffilter.preferences.VCFFilterPreferences;
import htsjdk.variant.vcf.VCFFileReader;
//import htsjdk.tribble.TribbleException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 * This class implements the first start-up screen that is launched when no preferences file is available.
 * StartupWizard.java 02 Dec 2016
 *
 * @author Heiko Müller
 * @version 1.0
 * @since 1.0
 */
public class StartupWizard extends javax.swing.JDialog {
    
    /**
     * The version number of this class.
     */
    static final long serialVersionUID = 1L;
    
    /**
     * Reference to the main application's graphical user interface.
     */
    VCFFilter gui;
    
    /**
     * Reference to the VCFFilter preferences.
     */
    VCFFilterPreferences PREFERENCES;

    
    /**
    * Creates new form StartupWizard.
    * 
    * @param parent the parent window
    * @param modal whether the dialog is modal
    * @author Heiko Müller
    * @since 1.0
    */
    public StartupWizard(VCFFilter parent, boolean modal) {
        super(parent, modal);
        gui = parent;
        initComponents();       

        //ImageIcon image = new ImageIcon("image/pic1.jpg");
        //JLabel jLabel1 = new JLabel();
        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        jLabel1.setVerticalAlignment(JLabel.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/at/ac/oeaw/cemm/bsf/vcffilter/icon/startup.png")));
        //jPanel1.add(jLabel1);
        centerWindow(this);

    }
    
    /**
    * Centers the preferences window on the screen.
    * 
    * @param frame frame to be centered
    * @author Heiko Müller
    * @since 1.0
    */
    public void centerWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
    
    /**
    * Chooses the ini file to be read depending on the presence/absence of 
    * VCFFilter_preferences.ini and VCFFilter_preferences_$username.ini.
    * 
    * @return user directory string
    * @author Heiko Müller
    * @since 1.0
    */
    public static String getUserDir() {
        String userdir = System.getProperties().getProperty("user.dir");  
        userdir = new File(userdir).toURI().getPath();       
        return userdir;    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VCFFilter: Welcome screen");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1107, 635));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        jButton1.setText("Open example VCF file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Start VCFFilter");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Open example VCF file event handler. Shows file open dialog.
    * 
    * @param evt the event
    * @author Heiko Müller
    * @since 1.0
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ExampleFileFilter vcfFilter = new ExampleFileFilter(new String[]{"vcf", "gz"}, "Load vcf files");
        jFileChooser1.addChoosableFileFilter(vcfFilter);
        jFileChooser1.setAcceptAllFileFilterUsed(false);
        String userdir = getUserDir();
        File maindir = new File(userdir);
        if(maindir != null && maindir.exists()){
            File datadir = new File(maindir.getAbsolutePath() + File.separator + "VCFData");
            if(datadir != null && datadir.exists()){
                jFileChooser1.setCurrentDirectory(datadir);
            }
        }
        jFileChooser1.showOpenDialog(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * Close start-up wizard event handler. Closes the wizard window.
    * 
    * @param evt the event
    * @author Heiko Müller
    * @since 1.0
    */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:              
        this.setVisible(false);           
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * Open example VCF file event handler. 
    * Opens chosen VCF file, inits VCFFilter preferences and saves settings to an .ini file.
    * At next start-up, VCFFilter will use this .ini file and the start-up wizard won't be shown.
    * 
    * @param evt the event
    * @author Heiko Müller
    * @since 1.0
    */
    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        if (evt.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
            File exampleVCF = jFileChooser1.getSelectedFile();         
            try{    
                //final ClassLoader wcl = StartupWizard.class.getClassLoader();  
                //URL u2 = wcl.getResource("htsjdk/variant/vcf/VCFFileReader.class");
                //URL[] urls = new URL[1];
                //urls[0] = u2;
                //ClassLoader ucl = new URLClassLoader(urls, wcl);
                //Thread.currentThread().setContextClassLoader(ucl);
                VCFFileReader vcf = new VCFFileReader(exampleVCF); 
                PREFERENCES = new VCFFilterPreferences(gui, true);
                PREFERENCES.setSampleVCFFile(exampleVCF);
                PREFERENCES.setDefaultDir(exampleVCF.getParentFile());
                PREFERENCES.initVCFHeaderLinesCollection();
                PREFERENCES.initAvailableFiltersList();            
                PREFERENCES.initFilterDefaultsHash();
                PREFERENCES.initAvailableOutputList();                 
                PREFERENCES.makeDefaultFiltersVisible();
                PREFERENCES.saveIni();
                jButton2.setEnabled(true);  
                jButton2.setBackground(Color.green);
            //}catch(TribbleException te){  
            }catch(Exception te){  
                jButton2.setEnabled(false);      
                new Warning(this, te.getMessage());            
                return;
            }               
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    /**
    * Close window event handler. When the wizard is closed, the application exits.
    * 
    * @param evt the event
    * @author Heiko Müller
    * @since 1.0
    */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        System.exit(0);         
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartupWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartupWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartupWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartupWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StartupWizard dialog = new StartupWizard(new VCFFilter(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                
            }
        });
        //}else{
        //    gui.setVisible(true);
        //}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
