

import java.awt.Graphics;


public class Grupo3 extends javax.swing.JFrame {

    public Grupo3() {
        initComponents();
    }


    @SuppressWarnings("unchecked")


    private int getXOval(int width,  int xCenter){


        return xCenter-(width/2);
    }

    private int getYOval(int height,  int yCenter){

        return yCenter-(height/2);
    }

    private void initComponents() {
        this.setTitle("Grupo 3");
        jPanel1 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g ) {
                super.paintComponent(g);
                int W = jPanel1.getWidth();
                int H = jPanel1.getHeight();

                for (int i = 0; i <= H; i += 7) {
                    g.drawOval(getXOval(i,i),getYOval(i,i),i,i);
                    g.drawOval(getXOval(i,i),getYOval(i,H-i),i,i);
                    g.drawOval(getXOval(i,W-i),getYOval(i,H-i),i,i);
                    g.drawOval(getXOval(i,W-i),getYOval(i,i),i,i);


                }

            }
        };
        jPanel2 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g ) {
                super.paintComponent(g);
                int W = jPanel1.getWidth();
                int H = jPanel1.getHeight();
                for (int i = 0; i <= H/2; i += 3) {
                    g.drawOval(getXOval(i,i),getYOval(i,i),i,i);
                    g.drawOval(getXOval(i,i),getYOval(i,H-i),i,i);
                    g.drawOval(getXOval(i,W-i),getYOval(i,H-i),i,i);
                    g.drawOval(getXOval(i,W-i),getYOval(i,i),i,i);


                }
            }
        };
        jPanel3 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g ) {
                super.paintComponent(g);
                int W = jPanel1.getWidth();
                int H = jPanel1.getHeight();
                for (int i = 0; i <= H/2; i += 5) {
                    g.drawOval(getXOval(i,i),getYOval(i,i),i,i);
                    g.drawOval(getXOval(i,i),getYOval(i,H-i),i,i);
                    g.drawOval(getXOval(i,W-i),getYOval(i,H-i),i,i);
                    g.drawOval(getXOval(i,W-i),getYOval(i,i),i,i);
                    g.drawOval(getXOval(i,i),getYOval(i,(H/2)),i,i);
                    g.drawOval(getXOval(i,W-i),getYOval(i,(H/2)),i,i);

                    g.drawOval(getXOval(i,(W/2)),getYOval(i,i),i,i);
                    g.drawOval(getXOval(i,(W/2)),getYOval(i,H-i),i,i);
                }
            }
        };
        jPanel4 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g ) {
                super.paintComponent(g);
                int W = jPanel1.getWidth();
                int H = jPanel1.getHeight();
                for (int i = 0; i <= W; i += 15) {

                    g.drawOval(0,0,i,i);
                    g.drawOval(0,H-i,i,i);
                    g.drawOval(W-i,0,i,i);
                    g.drawOval(W-i,H-i,i,i);

                }
            }
        };
        jPanel5 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g ) {
                super.paintComponent(g);
                int W = jPanel1.getWidth();
                int H = jPanel1.getHeight();
                for (int i = 0; i <= W; i += 4) {

                    g.drawOval(0,0,i,i);


                    g.drawOval(W-i,H-i,i,i);

                }
            }
        };
        jPanel6 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g ) {
                super.paintComponent(g);
                int W = jPanel1.getWidth();
                int H = jPanel1.getHeight();
                for (int i = 0; i <= W/2; i += 7) {

                    g.drawLine(i,H-i,(W/2),(H/2)-i);
                    g.drawLine((W/2),(H/2)-i,W-i,H-i);
                    g.drawLine(i,H-i,(W/2)+i,(H/2)+i);

                }
            }
        };
        jPanel7 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g ) {
                super.paintComponent(g);
                int W = jPanel1.getWidth();
                int H = jPanel1.getHeight();
                for (int i = 0; i <= W/2; i += 4) {
                
                    g.drawLine(0,(H/2)-i,i,0);
                    g.drawLine(0,(H/2)+i,i,H);
                    g.drawLine((W/2)+i,0,W,i);
                    g.drawLine((W/2)+i,H,W,H-i);
                 

         
                    g.drawLine(i,(H/2)-i,(W/2),i);
                    g.drawLine(W-i,(H/2)-i,(W/2),i);
                    g.drawLine(i,(H/2)+i,(W/2),H-i);
                    g.drawLine(W-i,(H/2)+i,(W/2),H-i);
                }
            }
        };
        jPanel8 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g ) {
                super.paintComponent(g);
                int W = jPanel1.getWidth();
                int H = jPanel1.getHeight();
                for (int i = 0; i <= W/2; i += 4) {


                    g.drawLine(i,i,(W/2),(H/2)-i);
                    g.drawLine(W-i,i,(W/2),(H/2)-i);
                    g.drawLine(i,H-i,(W/2),(H/2)+i);
                    g.drawLine(W-i,H-i,(W/2),(H/2)+i);

                    g.drawLine(0,i,i,(H/2));
                   g.drawLine(0,H-i,i,(H/2));
                    g.drawLine(W,i,W-i,(H/2));
                    g.drawLine(W,H-i,W-i,(H/2));

                }
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 162, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(161, 161));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 161, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 162, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(170, 170));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(170, 170));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 164, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grupo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grupo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grupo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grupo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grupo3().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;

}
