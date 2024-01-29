
package tuten;

/**
 *
 * @author yusuf
 */

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class DiaryPage extends javax.swing.JFrame {

    /**
     * Creates new form DiaryPage
     */
    
    private ArrayList<Diary> d = new ArrayList<Diary>();
    private DefaultListModel listModel = new DefaultListModel();
    
    public DiaryPage(Exam exam, String whoSolved, String whenStarted) {
        d = Files.readArrayListFromFile("diaries.ser");
        int scoreCounter = 0;

        for (int i = 0; i < exam.getN(); i++) {
            StringBuilder sb = new StringBuilder(); 
            int num1 = exam.getQuestions().get(i).getNum1();
            int num2 = exam.getQuestions().get(i).getNum2();
            int answer = exam.getQuestions().get(i).getAnswer();
            int result = exam.getQuestions().get(i).getResult();
            int time = exam.getQuestions().get(i).getTimePassed();
            boolean isTrue = exam.getQuestions().get(i).isTrue();

            sb.append(num1).append(" x ").append(num2).append(" = ").append(result).append(" answered as = ").append(answer);
    
            if (isTrue) {
                sb.append(" (True)");
                scoreCounter++;
            } else {
                sb.append(" (False)");
            }
            
            sb.append(" time passed = ").append(time);
            
            String last = sb.toString();
            
            listModel.addElement(last);
            
        }
        
        listModel.addElement("");
        String tmp = "Total score is = " + scoreCounter;
        listModel.addElement(tmp);
        
        initComponents();
        
        whoSolved += ":";
        lblName.setText(whoSolved);
        lblDate.setText(whenStarted);
        
        jList1.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        lblName.setText("jLabel1");

        lblDate.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
