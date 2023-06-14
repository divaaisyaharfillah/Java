import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Produk;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainFrame extends javax.swing.JFrame {
    private int totalBelanja = 0;
   
    
    public MainFrame() {
        initComponents();
        tanggalNow();
        updateTable();
    }

    private void updateTable() {
        // Mendapatkan data dari database, misalnya dalam bentuk ArrayList<Produk> dengan menggunakan metode dari DbController
        List<Produk> produkList = DbController.getDatabase();

        // Menghapus data yang ada dalam tabel
        DefaultTableModel model = (DefaultTableModel) tableBarang.getModel();
        model.setRowCount(0);

        // Menambahkan data dari ArrayList<Produk> ke tabel
        for (Produk produk : produkList) {
            Object[] row = {produk.getId(), produk.getNama(), produk.getHarga(), 0, produk.getjumlah()};
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTanggal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBarang = new javax.swing.JTable();
        buttonBayar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tf_tunai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_kembalian = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonAddtocart = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        editId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        editNama = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        editStok = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        editHarga = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        labelTidakCukup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("PENJUALAN DVSHOP");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NAMA PEMBELI");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TANGGAL");

        tfTanggal.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tfTanggal.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TOTAL :");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rp.");

        labelTotalHarga.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelTotalHarga.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(tfTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(tfTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(labelTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 153));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        tableBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAMA", "STOCK", "JUMLAH", "HARGA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBarang);
        if (tableBarang.getColumnModel().getColumnCount() > 0) {
            tableBarang.getColumnModel().getColumn(0).setMaxWidth(45);
            tableBarang.getColumnModel().getColumn(2).setMaxWidth(55);
            tableBarang.getColumnModel().getColumn(3).setMaxWidth(55);
        }

        buttonBayar.setBackground(new java.awt.Color(0, 0, 0));
        buttonBayar.setForeground(new java.awt.Color(255, 255, 255));
        buttonBayar.setText("BAYAR");
        buttonBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBayarActionPerformed(evt);
            }
        });

        jLabel6.setText("UANG :");

        jLabel7.setText("KEMBALIAN :");

        tf_kembalian.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_tunai, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(tf_kembalian))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_tunai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        buttonCancel.setBackground(new java.awt.Color(0, 0, 0));
        buttonCancel.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancel.setText("CANCEL");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonAddtocart.setBackground(new java.awt.Color(0, 0, 0));
        buttonAddtocart.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddtocart.setText("ADD TO CART");
        buttonAddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddtocartActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        editId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editIdActionPerformed(evt);
            }
        });

        jLabel10.setText("NAMA BARANG BARU");

        jLabel11.setText("STOK TERBARU");

        jLabel12.setText("HARGA BARU");

        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        labelTidakCukup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(134, 134, 134))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(editHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(editStok, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(editNama, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(editId))))
                                .addGap(18, 18, 18)
                                .addComponent(labelTidakCukup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAddtocart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(editId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelTidakCukup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(editNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(editStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(editHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddtocartActionPerformed
        int selectedRow = tableBarang.getSelectedRow();

        if (selectedRow != -1) {
            int stockBarang = Integer.parseInt(tableBarang.getValueAt(selectedRow, 2).toString());

            if (stockBarang > 0) {
                double hargaBarang = Double.parseDouble(tableBarang.getValueAt(selectedRow, 4).toString());
                totalBelanja += hargaBarang;
                labelTotalHarga.setText(String.valueOf(totalBelanja));

                int jumlahBarang = Integer.parseInt(tableBarang.getValueAt(selectedRow, 3).toString());
                stockBarang--;
                jumlahBarang++;
                tableBarang.setValueAt(stockBarang, selectedRow, 2);
                tableBarang.setValueAt(jumlahBarang, selectedRow, 3);
            }

        }
    }//GEN-LAST:event_buttonAddtocartActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        int selectedRow = tableBarang.getSelectedRow();

        if (selectedRow != -1) {
            int stockBarang = Integer.parseInt(tableBarang.getValueAt(selectedRow, 2).toString());
            int jumlahBarang = Integer.parseInt(tableBarang.getValueAt(selectedRow, 3).toString());
            if (jumlahBarang > 0) {
                double hargaBarang = Double.parseDouble(tableBarang.getValueAt(selectedRow, 4).toString());
                totalBelanja -= hargaBarang;
                labelTotalHarga.setText(String.valueOf(totalBelanja));

                stockBarang++;
                jumlahBarang--;
                tableBarang.setValueAt(stockBarang, selectedRow, 2);
                tableBarang.setValueAt(jumlahBarang, selectedRow, 3);

            }
        }
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBayarActionPerformed
        int selectedRow = tableBarang.getSelectedRow();
        String uangStr = tf_tunai.getText();
        String totalStr = labelTotalHarga.getText();
        int uang = Integer.parseInt(uangStr);
        int total = Integer.parseInt(totalStr);

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tableBarang.getModel();

            int id = (int) model.getValueAt(selectedRow, 0);
            int stockBarang = (int) model.getValueAt(selectedRow, 2);

            if (stockBarang > 0) {
                if (uang >= total) {
                    // Mengurangi stok barang di dalam tabel
                    model.setValueAt(stockBarang, selectedRow, 2);

                    // Update stok di database menggunakan DbController
                    DbController.updateJumlah(id, stockBarang);
                    labelTidakCukup.setText("");
                } else {
                    labelTidakCukup.setText("Uang anda tidak cukup");
                    updateTable();
                }
            }
        }

        int kembalian = uang - total;
        String kembalianStr = String.valueOf(kembalian);

        // Reset jumlah barang ke 0
        for (int row = 0; row < tableBarang.getRowCount(); row++) {
            DefaultTableModel model = (DefaultTableModel) tableBarang.getModel();
            model.setValueAt(0, row, 3);
        }

        // Reset total belanja ke 0
        tf_kembalian.setText(kembalianStr);
        totalBelanja = 0;
        labelTotalHarga.setText("0");
        
    }//GEN-LAST:event_buttonBayarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String namaBaru = editNama.getText();
        String hargaBarustr = editHarga.getText();
        String stokBarustr = editStok.getText();
        
        long hargaBaru = Long.parseLong(hargaBarustr);
        int stokBaru = Integer.parseInt(stokBarustr);
        DbController.insertData(namaBaru, hargaBaru, stokBaru);
        
        editNama.setText("");
        editHarga.setText("");
        editStok.setText("");
        updateTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String target = editId.getText();
        String namaBaru = editNama.getText();
        String stokBarustr = editStok.getText();
        String hargaBarustr = editHarga.getText();
        
        long hargaBaru = Long.parseLong(hargaBarustr);
        int stokBaru = Integer.parseInt(stokBarustr);
        int targetint = Integer.parseInt(target);
        
        DbController.updateNama(targetint, namaBaru );
        DbController.updateJumlah(targetint, stokBaru);
        DbController.updateHarga(targetint, hargaBaru);
        
        editId.setText("");
        editNama.setText("");
        editStok.setText("");
        editHarga.setText("");
        
        updateTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String target = editId.getText();
        
        int targetint = Integer.parseInt(target);
        DbController.deleteData(targetint);
       
        
        editId.setText("");
        updateTable();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void editIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editIdActionPerformed

    private void tanggalNow(){
                    // Mendapatkan tanggal saat ini
        LocalDate currentDate = LocalDate.now();

        // Format tanggal sesuai kebutuhan
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Mengubah tanggal menjadi string dalam format yang diinginkan
        String formattedDate = currentDate.format(dateFormatter);

        // Mengatur nilai tanggal ke field
        tfTanggal.setText(formattedDate);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddtocart;
    private javax.swing.JButton buttonBayar;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JTextField editHarga;
    private javax.swing.JTextField editId;
    private javax.swing.JTextField editNama;
    private javax.swing.JTextField editStok;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelTidakCukup;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JTable tableBarang;
    private javax.swing.JTextField tfTanggal;
    private javax.swing.JTextField tf_kembalian;
    private javax.swing.JTextField tf_tunai;
    // End of variables declaration//GEN-END:variables
}
