/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alomarket;

import  alomarket.YonetimAnasayfa;
import static alomarket.YonetimAnasayfa.stackK;
import javax.swing.table.DefaultTableModel;
import static alomarket.YonetimAnasayfa.stackU;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class MusteriAnasayfa extends javax.swing.JFrame {

    /**
     *  MusteriAnasayfa formu oluşturulur.
     */
    public MusteriAnasayfa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        kampTable = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        urunTable2 = new javax.swing.JTable();
        gor = new javax.swing.JButton();
        araTxt = new javax.swing.JTextField();
        araBt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        kGor = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        kampTable1 = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();

        jLabel12.setText("jLabel12");

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        kampTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "AD", "İÇERİK"
            }
        ));
        jScrollPane3.setViewportView(kampTable);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        urunTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ÜRÜN ", "KATEGORİ", "FİYAT", "MİKTAR"
            }
        ));
        jScrollPane1.setViewportView(urunTable2);

        gor.setText("Tüm Ürünler");
        gor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gorActionPerformed(evt);
            }
        });

        araBt.setText("ara");
        araBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gor)
                        .addGap(115, 115, 115)
                        .addComponent(araTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(araBt)))
                .addGap(0, 91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gor)
                    .addComponent(araTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(araBt))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("ÜRÜNLER", jPanel1);

        kGor.setText("LİSTELE");
        kGor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kGorActionPerformed(evt);
            }
        });

        kampTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "AD", "İÇERİK"
            }
        ));
        jScrollPane4.setViewportView(kampTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(kGor)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("KAMPANYALAR", jPanel2);

        jMenu6.setText("Katalog");
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void gorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gorActionPerformed
        YonetimAnasayfa ya=new YonetimAnasayfa();
        ya.cleanStack(stackU,urunTable2);
        DefaultTableModel model = (DefaultTableModel) urunTable2.getModel();
        Object rowData[] = new Object[4];
        ya.DefaultUrun();
        Node temp = stackU.head;
        model.getDataVector().removeAllElements(); // jtable´daki satirlar temizlenir.
        
        while (temp != null) {
            rowData[0] = ((Urun) temp.data).getad();
            rowData[1] = ((Urun) temp.data).getKategori();
            rowData[2] = ((Urun) temp.data).getFiyat();
            rowData[3] = ((Urun) temp.data).getMiktar();
            

            temp = temp.next;
            model.addRow(rowData);
        }
    }//GEN-LAST:event_gorActionPerformed
public static LinkedList Ll=new LinkedList();
    public Urun Filter(Urun temp){
        try {
            temp = stackU.linearSearchUrun(
                    araTxt.getText());
            JOptionPane.showMessageDialog(null,"ürün bulundu");
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null,"Lütfen doğru giriniz.");
            Filter(temp);
        } finally {
            return temp;
        }
    } 
    
    public void urunBul() {
        DefaultTableModel model = (DefaultTableModel) urunTable2.getModel();
        Object rowData[] = new Object[7];

        Urun temp = new Urun();

        temp = Filter(temp);

        rowData[0] = temp.getad();
        rowData[1] = temp.getKategori();
        rowData[2] = temp.getFiyat();
        rowData[3] = temp.getMiktar();
        model.getDataVector().removeAllElements();
        model.addRow(rowData);
    }
    /**
     * @param Filter bilgileri ile arama yapar ve ekranı yansıtır.
     */
    private void araBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araBtActionPerformed
        urunBul();
    }//GEN-LAST:event_araBtActionPerformed

    private void kGorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kGorActionPerformed
        
       YonetimAnasayfa ya=new YonetimAnasayfa();
        ya.cleanStack(stackK,kampTable1);
        DefaultTableModel model = (DefaultTableModel) kampTable1.getModel();
        Object rowData[] = new Object[3];
        ya.DefaultUrun();
        Node temp = stackK.head;
        model.getDataVector().removeAllElements(); // jtable´daki satirlar temizlenir.
        
        while (temp != null) {
            rowData[0] = ((Kampanya) temp.data).getId();
            rowData[1] = ((Kampanya) temp.data).getAd();
            rowData[2] = ((Kampanya) temp.data).getIcerik();
           
            temp = temp.next;
            model.addRow(rowData);
        }
    }//GEN-LAST:event_kGorActionPerformed
    
    /**
     * @param args the command line arguments
     */
     public static  void main(String args[]) {

        /* Form Çalıştırılır */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriAnasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton araBt;
    private javax.swing.JTextField araTxt;
    private javax.swing.JButton gor;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kGor;
    private javax.swing.JTable kampTable;
    private javax.swing.JTable kampTable1;
    private javax.swing.JTable urunTable2;
    // End of variables declaration//GEN-END:variables

    

    
}
