/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chapterfive;

/**
 *
 * @author Olakunle
 */
public class Body {

    private double height;
    private String color;
    private double weight;

    public Body(String color, double heigth, double weight) {
        this.color = color;
        this.height = heigth;
        this.weight = weight;

    }

    public Body(Body body) {
        color = body.color;
        weight = body.weight;
        height = body.height;

    }

    public static void moveBody() {
        System.out.println("Moving...");
    }

    public void bend() {
        System.out.println("My arm is bending...");
    }

    public class Arm {

        private String color;
        private double length;
        private int fingers;

        public Arm(String color, double length) {
            this.color = color;
            this.length = length;
        }

        public Arm(String color, double length, int finger) {
            this.color = color;
            this.length = length;
            this.fingers = finger;

        }

        public Arm(Arm arm) {
            color = arm.color;
            fingers = arm.fingers;
            length = arm.length;

        }

        public void pickSomething(String something) {
            System.out.println("i just picekd up something");

        }

        public void pushSomething(String something) {
            System.out.println("Pushing Something");
        }

        public void ClapSomebody(String person) {
            System.out.println("Clapped " + person);
        }

        public String amputateArm(String removeBody) {
            return removeBody;
        }

    }

}
