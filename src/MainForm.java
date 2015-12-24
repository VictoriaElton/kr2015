/**
 *
 * @author Виктория
 */
import javax.swing.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainForm extends JFrame {

    // Variables declaration - do not modify
    private javax.swing.JSpinner addDay = new javax.swing.JSpinner();
    private javax.swing.JMenuItem addMenuItem;
    private javax.swing.JSpinner addMonth = new javax.swing.JSpinner();
    private javax.swing.JComboBox addYear = new javax.swing.JComboBox();
    private javax.swing.ButtonGroup buttonGroup1= new javax.swing.ButtonGroup();
    private javax.swing.JButton cancelButton = new javax.swing.JButton();
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JFrame dialogAdd = new javax.swing.JFrame();
    private javax.swing.JFrame dialogDelete = new javax.swing.JFrame();
    private javax.swing.JMenu editMenu;
    private javax.swing.JRadioButton filmRadioButton= new javax.swing.JRadioButton();
    private static javax.swing.JList films = new javax.swing.JList<String>();
    private static javax.swing.JList grafic = new javax.swing.JList<String>();
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1= new javax.swing.JButton();
    private javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4= new javax.swing.JLabel();
    private javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2  = new javax.swing.JPanel();
    private javax.swing.JPanel jPanel3= new javax.swing.JPanel();
    private javax.swing.JPanel jPanel4= new javax.swing.JPanel();
    private javax.swing.JScrollPane jScrollPane1= new javax.swing.JScrollPane();
    private javax.swing.JScrollPane jScrollPane2= new javax.swing.JScrollPane();
    private javax.swing.JScrollPane jScrollPane3= new javax.swing.JScrollPane();
    private javax.swing.JScrollPane jScrollPane4= new javax.swing.JScrollPane();
    private javax.swing.JTabbedPane jTabbedPane4 = new javax.swing.JTabbedPane();
    private javax.swing.JTextField jTextField1= new javax.swing.JTextField();
    private javax.swing.JTextField nameAdd = new javax.swing.JTextField();
    private javax.swing.JButton okButton = new javax.swing.JButton();
    private static javax.swing.JList past= new javax.swing.JList<String>();
    private javax.swing.JMenu saveMenuItem;
    private javax.swing.JButton seachButton;
    private javax.swing.JSpinner seachDay;
    private javax.swing.JSpinner seachMonth;
    private javax.swing.JComboBox seachYear;
    private static javax.swing.JList serial = new javax.swing.JList<String>();
    private javax.swing.JRadioButton serialRadioButton= new javax.swing.JRadioButton();
    private static Application app=new Application();
    private static DefaultListModel<String> modelFilms=new DefaultListModel<String>();
    private static DefaultListModel<String> modelSerials=new DefaultListModel<String>();
    private static DefaultListModel<String> modelPast=new DefaultListModel<String>();
    private static DefaultListModel<String> modelGrafic=new DefaultListModel<String>();
    // End of variables declaration

        public MainForm() {
            java.awt.GridBagConstraints gridBagConstraints;

            jPanel1 = new javax.swing.JPanel();
            seachDay = new javax.swing.JSpinner();
            seachMonth = new javax.swing.JSpinner();
            seachYear = new javax.swing.JComboBox();
            seachButton = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jMenuBar1 = new javax.swing.JMenuBar();
            saveMenuItem = new javax.swing.JMenu();
            jMenuItem3 = new javax.swing.JMenuItem();
            editMenu = new javax.swing.JMenu();
            addMenuItem = new javax.swing.JMenuItem();
            deleteMenuItem = new javax.swing.JMenuItem();
            helpMenu = new javax.swing.JMenu();

            dialogAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            java.awt.GridBagLayout dialogAddLayout = new java.awt.GridBagLayout();
            dialogAddLayout.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            dialogAddLayout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            dialogAdd.getContentPane().setLayout(dialogAddLayout);

            jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            jLabel1.setText("Название:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 11;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(4, 6, 4, 6);
            dialogAdd.getContentPane().add(jLabel1, gridBagConstraints);

            nameAdd.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
            nameAdd.setForeground(new java.awt.Color(0, 102, 102));
            nameAdd.setText("Введите название");
            nameAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.gridwidth = 11;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
            dialogAdd.getContentPane().add(nameAdd, gridBagConstraints);

            jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            jLabel4.setText("Дата выхода:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 4;
            gridBagConstraints.gridwidth = 13;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(4, 6, 4, 6);
            dialogAdd.getContentPane().add(jLabel4, gridBagConstraints);

            java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
            jPanel2Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
            jPanel2Layout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            jPanel2.setLayout(jPanel2Layout);

            addDay.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            addDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
            addDay.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            jPanel2.add(addDay, gridBagConstraints);

            addMonth.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            addMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
            addMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 0;
            jPanel2.add(addMonth, gridBagConstraints);

            addYear.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            addYear.setEditable(true);
            addYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018" }));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 4;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 7;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            jPanel2.add(addYear, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 6;
            gridBagConstraints.gridwidth = 21;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(2, 10, 2, 10);
            dialogAdd.getContentPane().add(jPanel2, gridBagConstraints);

            okButton.setBackground(new java.awt.Color(102, 102, 102));
            okButton.setFont(new java.awt.Font("Segoe Script", 2, 14)); // NOI18N
            okButton.setText("Ок");
            okButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    okButtonActionPerformed(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 8;
            gridBagConstraints.gridwidth = 17;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(10, 74, 10, 34);
            dialogAdd.getContentPane().add(okButton, gridBagConstraints);

            cancelButton.setBackground(new java.awt.Color(102, 102, 102));
            cancelButton.setFont(new java.awt.Font("Segoe Script", 2, 14)); // NOI18N
            cancelButton.setText("Отмена");
            cancelButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cancelButtonActionPerformed(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 18;
            gridBagConstraints.gridy = 8;
            gridBagConstraints.gridwidth = 19;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(10, 24, 10, 74);
            dialogAdd.getContentPane().add(cancelButton, gridBagConstraints);

            jPanel4.setLayout(new java.awt.GridBagLayout());

            buttonGroup1.add(filmRadioButton);
            filmRadioButton.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
            filmRadioButton.setText("Фильм");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(6, 10, 6, 10);
            jPanel4.add(filmRadioButton, gridBagConstraints);

            buttonGroup1.add(serialRadioButton);
            serialRadioButton.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
            serialRadioButton.setText("Сериал");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(6, 10, 6, 10);
            jPanel4.add(serialRadioButton, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 28;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.gridheight = 3;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            dialogAdd.getContentPane().add(jPanel4, gridBagConstraints);

            dialogDelete.setPreferredSize(new java.awt.Dimension(300, 150));
            dialogDelete.getContentPane().setLayout(new java.awt.GridBagLayout());

            jTextField1.setFont(new java.awt.Font("Segoe Script", 2, 14)); // NOI18N
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = 13;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(13, 0, 13, 0);
            dialogDelete.getContentPane().add(jTextField1, gridBagConstraints);

            jLabel5.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
            jLabel5.setText("Введите название:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 4;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 5;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
            dialogDelete.getContentPane().add(jLabel5, gridBagConstraints);

            jButton1.setBackground(new java.awt.Color(102, 102, 102));
            jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            jButton1.setText("Ok");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 4;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.gridwidth = 5;
            dialogDelete.getContentPane().add(jButton1, gridBagConstraints);

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setPreferredSize(new java.awt.Dimension(700, 400));
            getContentPane().setLayout(new java.awt.GridBagLayout());

            jPanel3.setMinimumSize(new java.awt.Dimension(450, 103));
            jPanel3.setPreferredSize(new java.awt.Dimension(500, 310));
            java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
            jPanel3Layout.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            jPanel3Layout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            jPanel3.setLayout(jPanel3Layout);

            grafic.setBackground(new java.awt.Color(51, 51, 51));
            grafic.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
            grafic.setForeground(new java.awt.Color(255, 255, 255));
            //grafic.setModel(new javax.swing.AbstractListModel() {
            //    String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            //    public int getSize() { return strings.length; }
            //    public Object getElementAt(int i) { return strings[i]; }
            //});
            grafic.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            grafic.setMaximumSize(new java.awt.Dimension(44, 72));
            grafic.setMinimumSize(new java.awt.Dimension(44, 70));
            grafic.setName(""); // NOI18N
            grafic.setPreferredSize(new java.awt.Dimension(35, 70));
            grafic.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    graficValueChanged(evt);
                }
            });
            jScrollPane3.setViewportView(grafic);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.gridwidth = 3;
            gridBagConstraints.gridheight = 19;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
            gridBagConstraints.weightx = 2.0;
            gridBagConstraints.weighty = 2.0;
            jPanel3.add(jScrollPane3, gridBagConstraints);

            jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));
            jTabbedPane4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jTabbedPane4.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
            jTabbedPane4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
            jTabbedPane4.setPreferredSize(new java.awt.Dimension(130, 195));

            jScrollPane1.setBorder(null);

            films.setBackground(new java.awt.Color(102, 102, 102));
            films.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            films.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
            //films.setModel(new javax.swing.AbstractListModel() {
            //    String[] strings = ;
            //    public int getSize() { return strings.length; }
            //    public Object getElementAt(int i) { return strings[i]; }
            //});
            films.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            films.setToolTipText("");
            films.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    filmsValueChanged(evt);
                }
            });
            jScrollPane1.setViewportView(films);

            jTabbedPane4.addTab("Фильмы", jScrollPane1);

            jScrollPane2.setBorder(null);

            serial.setBackground(new java.awt.Color(102, 102, 102));
            serial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            serial.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
            //serial.setModel(new javax.swing.AbstractListModel() {
            //    String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            //    public int getSize() { return strings.length; }
            //    public Object getElementAt(int i) { return strings[i]; }
            //});
            serial.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            serial.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    serialValueChanged(evt);
                }
            });
            jScrollPane2.setViewportView(serial);

            jTabbedPane4.addTab("Сериалы", jScrollPane2);

            past.setBackground(new java.awt.Color(153, 153, 153));
            past.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
            //past.setModel(new javax.swing.AbstractListModel() {
            //   String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            //    public int getSize() { return strings.length; }
            //    public Object getElementAt(int i) { return strings[i]; }
            //});
            past.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            past.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    pastValueChanged(evt);
                }
            });
            jScrollPane4.setViewportView(past);

            jTabbedPane4.addTab("Прошедшие", jScrollPane4);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 4;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 29;
            gridBagConstraints.gridheight = 27;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
            gridBagConstraints.weightx = 2.5;
            gridBagConstraints.weighty = 2.0;
            gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
            jPanel3.add(jTabbedPane4, gridBagConstraints);

            java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
            jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
            jPanel1Layout.rowHeights = new int[] {0};
            jPanel1.setLayout(jPanel1Layout);

            seachDay.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            seachDay.setModel(new javax.swing.SpinnerNumberModel(0, 0, 31, 1));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            jPanel1.add(seachDay, gridBagConstraints);

            seachMonth.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            seachMonth.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            jPanel1.add(seachMonth, gridBagConstraints);

            seachYear.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            seachYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018" }));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 4;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.weightx = 0.5;
            gridBagConstraints.weighty = 0.5;
            jPanel1.add(seachYear, gridBagConstraints);

            seachButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            seachButton.setText("Поиск");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 6;
            gridBagConstraints.gridy = 0;
            jPanel1.add(seachButton, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 24;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
            gridBagConstraints.weightx = 0.5;
            jPanel3.add(jPanel1, gridBagConstraints);

            jLabel2.setFont(new java.awt.Font("Segoe Print", 2, 14)); // NOI18N
            jLabel2.setText("Поиск по дате выхода:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 22;
            gridBagConstraints.gridwidth = 5;
            jPanel3.add(jLabel2, gridBagConstraints);

            jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
            jLabel3.setText("График кинопремьер:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 13;
            gridBagConstraints.gridheight = 2;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
            gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
            jPanel3.add(jLabel3, gridBagConstraints);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = 25;
            gridBagConstraints.gridheight = 15;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            getContentPane().add(jPanel3, gridBagConstraints);

            jMenuBar1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

            saveMenuItem.setText("File");
            saveMenuItem.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

            jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
            jMenuItem3.setText("Сохранить");
            jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
                        jMenuItem3ActionPerformed(evt);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            saveMenuItem.add(jMenuItem3);

            jMenuBar1.add(saveMenuItem);

            editMenu.setText("Edit");
            editMenu.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

            addMenuItem.setText("Добавить...");
            addMenuItem.setToolTipText("");
            addMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addMenuItemActionPerformed(evt);
                }
            });
            editMenu.add(addMenuItem);

            deleteMenuItem.setText("Удалить");
            deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    deleteMenuItemActionPerformed(evt);
                }
            });
            editMenu.add(deleteMenuItem);

            jMenuBar1.add(editMenu);

            helpMenu.setText("Help");
            helpMenu.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
            jMenuBar1.add(helpMenu);

            setJMenuBar(jMenuBar1);

            pack();
        }// </editor-fold>

    private void graficValueChanged(javax.swing.event.ListSelectionEvent evt) {
        // TODO add your handling code here:
    }

    private void addMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        dialogAdd.setVisible(true);
    }

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException { //save
        for(int i=0; i<modelFilms.getSize();i++){
            app.filmsArr.add(i,modelFilms.getElementAt(i));
        }

        for(int i=0; i<modelSerials.getSize();i++){
            app.serialsArr.add(i, modelSerials.getElementAt(i));
        }

        for(int i=0; i<modelPast.getSize();i++){
            app.pastArr.add(i, modelPast.getElementAt(i));
        }

        for(int i=0; i<modelGrafic.getSize();i++){
            app.graficArr.add(i, modelGrafic.getElementAt(i));
        }

        app.saveFilms();
        app.saveSerials();
    }

    private void serialValueChanged(javax.swing.event.ListSelectionEvent evt) {
        // TODO add your handling code here:
    }

    private void filmsValueChanged(javax.swing.event.ListSelectionEvent evt) {
        // TODO add your handling code here:
    }

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String n=nameAdd.getText();
        String d=addDay.getValue().toString()+"."+addMonth.getValue().toString()+"."+addYear.getSelectedItem().toString();
        Date Current_Date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        format1.format(Current_Date);
        if (Integer.parseInt(format1.format(Current_Date).substring(format1.format(Current_Date).length()-4))>Integer.parseInt(d.substring(d.length()-4))){
            modelPast.addElement(n+" "+d);
        }
        else
            if (Integer.parseInt(format1.format(Current_Date).substring(format1.format(Current_Date).length()-4))==Integer.parseInt(d.substring(d.length()-4))) {
                if (Integer.parseInt(format1.format(Current_Date).substring(3, 4)) > Integer.parseInt(d.substring(3, 4))) {
                    if (Integer.parseInt(format1.format(Current_Date).substring(0, 1)) > Integer.parseInt(d.substring(0, 1))) {
                        modelPast.addElement(n + " " + d);
                    }
                }
            }
        else {
                if (filmRadioButton.isSelected()) {
                    modelFilms.addElement(n + " " + d);
                }
                else
                    modelSerials.addElement(n + " " + d);
            }
        dialogAdd.dispose();

    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dialogAdd.dispose();
    }

    private void pastValueChanged(javax.swing.event.ListSelectionEvent evt) {
        // TODO add your handling code here:
    }



    /**
         * @param args the command line arguments
         */
        public static void main(String args[]) throws IOException {
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
                java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>


            app.uploadFilms();
            app.uploadSerials();

            for(String str:app.filmsArr){
                modelFilms.addElement(str);
            }
            films.setModel(modelFilms);

            for (String str:app.serialsArr){
                modelSerials.addElement(str);
            }
            serial.setModel(modelSerials);

            for(String str:app.pastArr){
                modelPast.addElement(str);
            }
            past.setModel(modelPast);

            for(String str:app.graficArr){
                modelGrafic.addElement(str);
            }
            grafic.setModel(modelGrafic);


        /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainForm().setVisible(true);
                }
            });
        }
    }


