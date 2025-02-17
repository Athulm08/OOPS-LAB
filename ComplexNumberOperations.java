import java.util.Scanner;

class Complex {
    double real, imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    Complex multiply(Complex c) {
        double realPart = this.real * c.real - this.imaginary * c.imaginary;
        double imaginaryPart = this.real * c.imaginary + this.imaginary * c.real;
        return new Complex(realPart, imaginaryPart);
    }


    void display() {
        if (imaginary < 0) {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }
}

public class ComplexNumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        System.out.print("Real: ");
        double real1 = sc.nextDouble();
        System.out.print("Imaginary: ");
        double imaginary1 = sc.nextDouble();


        System.out.println("Enter the real and imaginary parts of the second complex number:");
        System.out.print("Real: ");
        double real2 = sc.nextDouble();
        System.out.print("Imaginary: ");
        double imaginary2 = sc.nextDouble();


        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);


        Complex additionResult = c1.add(c2);
        System.out.print("Addition of the two complex numbers: ");
        additionResult.display();

        Complex multiplicationResult = c1.multiply(c2);
        System.out.print("Multiplication of the two complex numbers: ");
        multiplicationResult.display();
    }
}
