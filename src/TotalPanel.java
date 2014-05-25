import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;

/**
 * Created by bbraun on 5/10/2014.
 */
public class TotalPanel extends JPanel {

    private BigDecimal tax = new BigDecimal(".06");
    private Computer computer;
    private String computers;
    private String months;
    private JLabel numberPcsLabel;
    private JTextField numberOfPcs;
    private JPanel pcPanel;
    private JLabel payOffMonthsLabel;
    private JTextField payOffMonths;
    private JPanel monthsPanel;
    private JButton calculate;
    private JPanel calculatePanel;
    private JPanel accCostPanel;
    private JPanel customerCostPanel;
    private JLabel accLabel;
    private JLabel customerLabel;
    private BigDecimal accCost;
    private BigDecimal customerCost;
    private int pcs;
    private int mnths;

    public TotalPanel(final Computer computer) {

        this.computer = computer;
        computers = "10";
        months = "6";

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        pcPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        monthsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        calculatePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        accCostPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        customerCostPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        numberPcsLabel = new JLabel("Number of Computers: ");
        numberOfPcs = new JTextField(computers, 10);
        numberOfPcs.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar) ||
                        (vChar == KeyEvent.VK_BACK_SPACE) ||
                        (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });

        payOffMonthsLabel = new JLabel("Months till Payoff: ");
        payOffMonths = new JTextField(months, 10);
        payOffMonths.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar) ||
                        (vChar == KeyEvent.VK_BACK_SPACE) ||
                        (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });

        calculate = new JButton("Calculate Cost");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accCost = computer.getCost(Integer.parseInt(numberOfPcs.getText()), tax);
                accLabel.setText("$" + accCost.toString());
                customerCost = calculateMonthly(accCost, Integer.parseInt(payOffMonths.getText()));
                customerLabel.setText("$" + customerCost.toString());
            }
        });

        accLabel = new JLabel();
        accCostPanel.add(new JLabel("ACC Cost: "));
        accCostPanel.add(accLabel);

        customerLabel = new JLabel();
        customerCostPanel.add(new JLabel("Customer Monthly Cost: "));
        customerCostPanel.add(customerLabel);

        pcPanel.add(numberPcsLabel);
        pcPanel.add(numberOfPcs);
        monthsPanel.add(payOffMonthsLabel);
        monthsPanel.add(payOffMonths);
        calculatePanel.add(calculate);

        add(pcPanel);
        add(monthsPanel);
        add(accCostPanel);
        add(customerCostPanel);
        add(calculatePanel);
    }

    private BigDecimal calculateMonthly(BigDecimal cost, int months) {
        BigDecimal total;
        total = cost.divide(new BigDecimal(months), 2, BigDecimal.ROUND_HALF_EVEN);
        return total;
    }
}
