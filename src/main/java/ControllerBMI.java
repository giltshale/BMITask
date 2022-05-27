import java.awt.*;

public class ControllerBMI {

    public static void main(String[] args) {
        ViewBMI view = new ViewBMI();
        view.clear.addActionListener(e -> {
            //empty  radio
            view.actualWeight.setText(null);
            view.bodyFrameGroup.clearSelection();
            view.heightSlider.setValue(BmiModel.SLIDER_LOW_VAL);
            //empty person info
            view.genderGroup.clearSelection();
            view.firstNameText.setText(null);
            view.lastNameText.setText(null);
            view.ageText.setText(null);

            //empty Button
            view.idealWeightLabel.setText("");
            view.weightStatusLabel.setText("");
            view.bmiLabel.setText("");
        });

        view.submitButton.addActionListener(e -> {
            if (view.getFirstNameText().isEmpty() || view.getLastNameText().isEmpty()) {
                if (view.getGenderGroup() == null) {
                    view.errorMassage(1);
                }
            } else
                try {
                    //BMI calc
                    double height = view.heightSlider.getValue();
                    double ageText = Double.parseDouble(view.ageText.getText());
                    double actualWeight = Double.parseDouble(view.actualWeight.getText());
                    double idealWeight = (((height - 100 + ageText / 10)) * 0.9 * view.slimness);
                    height /= 100;
                    view.bmi = (actualWeight / (Math.pow((height), 2)));
                    view.bmiLabel.setFont(new Font("System", Font.BOLD, 16));
                    view.bmiLabel.setText(view.firstNameText.getText().toUpperCase() + " " +
                            view.lastNameText.getText().toUpperCase() + "BMI IS: "
                            + String.format("%.2f", view.bmi) + "\n");
                    /*

                    JUST FOR LAUGH:

                     IF (view.firstName.equals("Uri") && view.firstName.equals("Shild") {

                       System.out.println("YOU'R BMI IF PERFECT, I WISH I WERE YOU ");

                      }
                     */
                    if (view.bmi < 15) {
                        view.weightStatusLabel.setText("Anorexic");
                    } else if (view.bmi < 18.5) {
                        view.weightStatusLabel.setText("Underweight");
                    } else if (view.bmi <= 24.9) {
                        view.weightStatusLabel.setText("Normal");
                    } else if (view.bmi <= 29.9) {
                        view.weightStatusLabel.setText("Overweight");
                    } else if (view.bmi <= 35) {
                        view.weightStatusLabel.setText("Obese");
                    } else {
                        view.weightStatusLabel.setText("Extreme_Obese");
                    }
                    view.weightStatusLabel.setText("WEIGHT STATUS IS : " + view.weightStatusLabel.getText());

                    view.weightStatus.setText("ACTUAL WEIGHT: " + view.actualWeight.getText());
                    System.out.println(view.actualWeight.getText());
                    view.idealWeightLabel.setText("IDEAL WEIGHT: " + String.format("%.2f", idealWeight));

                } catch (NullPointerException | NumberFormatException exception) {
                    view.errorMassage(2);
                }
        });

        view.heightSlider.addChangeListener(e -> {
                    view.heightLabel.setText("Height: " + view.height + " cm");
                    view.height = view.heightSlider.getValue();
                    view.heightLabel.repaint();
                }
        );
        view.small.addActionListener(e ->
                view.setSlimness(BmiModel.SMALL));
        view.medium.addActionListener(e ->
                view.setSlimness(BmiModel.MEDIUM));
        view.large.addActionListener(e ->
                view.setSlimness(BmiModel.LARGE));

    }


}
