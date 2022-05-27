import javax.swing.*;
import java.awt.*;

public class ViewBMI extends JFrame {

    private JPanel submitAndClearPanel;
    public JButton clear, submitButton;
    //data and analysis
    final JTextField firstNameText;
    final JTextField lastNameText;
    final JTextField ageText;
    final ButtonGroup genderGroup;
    //image
    private final ImageIcon dragon;
    //results
    double bmi;
    JLabel bmiLabel;
    JLabel weightStatusLabel;
    JLabel idealWeightLabel;
    JLabel actualWeightLabel;
    JLabel bodyChoice;
    JLabel weightStatus;

    final JTextField actualWeight;
    ButtonGroup bodyFrameGroup;
    JRadioButton small, medium, large;
    double slimness;
    int height;
    JLabel heightLabel;
    JSlider heightSlider;
    JPanel dataAndAnalysis = new JPanel();
    JPanel mainPanel = new JPanel();

    //


    public ViewBMI() {


        //BodyRight
        bodyChoice = new JLabel("Body-frame:");
        bodyChoice.setBounds(BmiModel.BODY_CHOICE_RADIO_X, BmiModel.BODY_CHOICE_RADIO_Y, BmiModel.BODY_CHOICE_WIDTH_LABEL, BmiModel.BODY_CHOICE_HEIGHT_LABEL);
        dataAndAnalysis.add(bodyChoice);

        this.small = new JRadioButton("Small");
        this.small.setBounds(BmiModel.BODY_CHOICE_RADIO_X, BmiModel.RADIO_SMALL_CHOICE_Y, BmiModel.BODY_CHOICE_WIDTH, BmiModel.BODY_CHOICE_HEIGHT);
        this.medium = new JRadioButton("Medium");
        this.medium.setBounds(small.getBounds().x, BmiModel.RADIO_MEDIUM_CHOICE_Y, BmiModel.BODY_CHOICE_WIDTH, BmiModel.BODY_CHOICE_HEIGHT);

        this.large = new JRadioButton("Large");
        this.large.setBounds(small.getBounds().x, BmiModel.RADIO_LARGE_CHOICE_Y, BmiModel.BODY_CHOICE_WIDTH, BmiModel.BODY_CHOICE_HEIGHT);

        this.bodyFrameGroup = new ButtonGroup();
        this.bodyFrameGroup.add(small);
        this.bodyFrameGroup.add(medium);
        this.bodyFrameGroup.add(large);

        this.small.setBackground(BmiModel.RANDOM_LIGHT_COLORS1);
        dataAndAnalysis.add(small);
        this.medium.setBackground(BmiModel.RANDOM_LIGHT_COLORS1);
        dataAndAnalysis.add(medium);
        this.large.setBackground(BmiModel.RANDOM_LIGHT_COLORS1);
        dataAndAnalysis.add(large);
        //
        this.setBackground(BmiModel.RANDOM_LIGHT_COLORS1);


        //slider

        this.heightLabel = new JLabel("Height: 140 cm");
        heightLabel.setBounds(BmiModel.SLIDER_LABEL_X, BmiModel.SLIDER_LABEL_Y, BmiModel.WIDTH_SLIDER_LABEL, BmiModel.WIDTH_SLIDER_LABEL);
        dataAndAnalysis.add(heightLabel);

        this.heightSlider = new JSlider(0, BmiModel.HEIGHT_SLIDER_MIN_VAL, BmiModel.HEIGHT_SLIDER_MAX_VAL, BmiModel.HEIGHT_SLIDER_MIN_VAL);
        this.heightSlider.setMajorTickSpacing(10);
        this.heightSlider.setMinorTickSpacing(5);
        this.heightSlider.setPaintTicks(true);
        this.heightSlider.setPaintLabels(true);
        this.heightSlider.setBounds(BmiModel.HEIGHT_SLIDER_LABEL_X, BmiModel.HEIGHT_SLIDER_LABEL_Y, 200, BmiModel.HEIGHT_SLIDER_LABEL);
        this.heightSlider.setBackground(BmiModel.RANDOM_LIGHT_COLORS1);
        dataAndAnalysis.add(heightSlider);

        dataAndAnalysis.setPreferredSize(new Dimension(200, 600));
        //
        dataAndAnalysis.setLayout(null);
        dataAndAnalysis.setBackground(BmiModel.RANDOM_LIGHT_COLORS1);

        //Bmi result

        this.bmiLabel = new JLabel("");
        this.bmiLabel.setBounds(BmiModel.BMI_LABEL_X, 250, 300, 50);
        dataAndAnalysis.add(bmiLabel);

        actualWeightLabel = new JLabel("Your weight is: ");
        actualWeightLabel.setBounds(BmiModel.ACTUAL_WEIGHT_LABEL_X, BmiModel.ACTUAL_WEIGHT_LABEL_Y, BmiModel.ACTUAL_WEIGHT_LABEL_WIDTH, BmiModel.ACTUAL_WEIGHT_LABEL_HEIGHT);
        dataAndAnalysis.add(actualWeightLabel);

        this.actualWeight = new JTextField();
        actualWeight.setBounds(BmiModel.ACTUAL_WEIGHT_LABEL_X, BmiModel.FRAME_Y, BmiModel.TEXT_WIDTH, BmiModel.ACTUAL_WEIGHT_HEIGHT);
        this.setBounds(BmiModel.ACTUAL_WEIGHT_LABEL_X, BmiModel.FRAME_Y, BmiModel.TEXT_WIDTH, BmiModel.TEXT_HEIGHT);
        dataAndAnalysis.add(actualWeight);

        this.weightStatusLabel = new JLabel("");
        this.weightStatusLabel.setBounds(BmiModel.WEIGHT_LABEL, BmiModel.WEIGHT_LABEL_X, 300, 50);
        this.weightStatusLabel.setFont(new Font("System", Font.BOLD, 16));
        this.dataAndAnalysis.add(weightStatusLabel);

        this.weightStatus = new JLabel("");
        this.weightStatus.setBounds(weightStatusLabel.getX(), weightStatusLabel.getY()+50, 200, 25);
        this.weightStatus.setFont(new Font("System", Font.BOLD, 16));
        dataAndAnalysis.add(weightStatus);

        this.idealWeightLabel = new JLabel("");
        this.idealWeightLabel.setBounds(weightStatusLabel.getX(), weightStatusLabel.getY()+100, 200, 25);
        this.idealWeightLabel.setFont(new Font("System", Font.BOLD, 16));
        dataAndAnalysis.add(idealWeightLabel);
        //
        JLabel firstName = new JLabel("First Name : ");
        firstName.setBounds(15, 5, 100, 50);
        dataAndAnalysis.add(firstName);
        this.firstNameText = new JTextField();
        firstNameText.setBounds(firstName.getX(), 40, 165, 25);
        dataAndAnalysis.add(firstNameText);

        JLabel lastName = new JLabel("Last Name : ");
        lastName.setBounds(firstName.getX(), 70, 100, 50);
        dataAndAnalysis.add(lastName);

        this.lastNameText = new JTextField();
        this.lastNameText.setBounds(firstName.getX(), 100, 165, 25);
        dataAndAnalysis.add(lastNameText);

        JLabel age = new JLabel("Age : ");
        age.setBounds(firstName.getX(), 170, 100, 50);
        dataAndAnalysis.add(age);

        this.ageText = new JTextField();
        ageText.setBounds(firstName.getX(), 210, 165, 25);
        dataAndAnalysis.add(ageText);


        JLabel gender = new JLabel("Gender :");
        gender.setBounds(305, 90, 100, 50);
        dataAndAnalysis.add(gender);

        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(gender.getX(), 150, 80, 25);
        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(gender.getX(), 130, 80, 25);

        this.genderGroup = new ButtonGroup();
        this.genderGroup.add(femaleRadio);
        this.genderGroup.add(maleRadio);

        femaleRadio.setBackground(BmiModel.RANDOM_LIGHT_COLORS1);
        maleRadio.setBackground(BmiModel.RANDOM_LIGHT_COLORS1);

        dataAndAnalysis.add(femaleRadio);
        dataAndAnalysis.add(maleRadio);

        dataAndAnalysis.setPreferredSize(new Dimension(200, 600));

        //  frame
        this.setTitle("BMI Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(new Dimension(600, 600));

        //  Main panel
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setSize(new Dimension(0, 600));

        this.getContentPane().add(mainPanel);


        //  buttons reset & submit
        this.submitAndClearPanel = new JPanel();
        this.submitAndClearPanel.setBackground(BmiModel.RANDOM_LIGHT_COLORS2);
        clear = new JButton("Clear");
        this.submitAndClearPanel.add(clear);
        submitButton = new JButton("Submit");
        this.submitAndClearPanel.add(submitButton);

        // Adding  panels
        mainPanel.add(dataAndAnalysis, BorderLayout.CENTER);
        mainPanel.add(submitAndClearPanel, BorderLayout.NORTH);
        //picture
        ImageIcon imageIcon = new ImageIcon("src/dragon.jpg");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(BmiModel.PICTURE_WIDTH, BmiModel.PICTURE_HEIGHT, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        this.dragon = new ImageIcon(newimg);
        this.setVisible(true);

    }

    public void errorMassage(int error) {
        if (error == 1) {
            JOptionPane.showMessageDialog(this, "Form Not Completed");
        }
        if (error == 2) {
            JOptionPane.showMessageDialog(this, "Wrong input,try again");
        }
    }

    //picture paint
    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.dragon.paintIcon(this, graphics, 350, 450);
        repaint();
    }

    public void setSlimness(double slimness) {
        this.slimness = slimness;
    }



    public String getFirstNameText() {
        return firstNameText.getText();
    }

    public String getLastNameText() {
        return lastNameText.getText();
    }

    public ButtonModel getGenderGroup() {
        return genderGroup.getSelection();
    }

}
