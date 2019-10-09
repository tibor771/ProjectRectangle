package sk.itsovy.sestak;

public class Main {

    public static void main(String[] args) {
        Person person1;
        person1 = new Person();

        Person person2=new Person();

        person1.setName("Tibor");
        person2.setName("Marcela");
        person1.setAge(29);
        System.out.println(person1);
        System.out.println(person2);
        person1.setHeight(1.8);
        person1.setWeight(92);

        Mobile mobile1=new Mobile();
        mobile1.setBrand("Huawei");
        mobile1.setModel("P30");
        mobile1.setPhoneNumber("+421908745328");

        Mobile mobile2=new Mobile("Samsung","S9","0908123852");

        person1.setMobile(mobile1);

        person1.about();
        System.out.println("Your BMI: "+ person1.calculateBMI() );
        System.out.println("Result: "+ person1.getBMIStatus());
        System.out.println("Birthyear: "+person1.getBirthYear());
        System.out.println("Person 1 is "+person1.getAge()+" yo");

        Person student=new Person("Oliver", 19, 1.88, 97, true, 'S');
        student.setMobile(mobile2);

        if(student.hasMobilePhone())
            System.out.println("Phone number: "+student.getMobile().getPhoneNumber());
        else
            System.out.println("Student has no mobile !");

        person2.print();

        Calculator casio=new Calculator("Casio FX552");
        person2.setCalculator(casio);

        if(person2.hasCalculator()){
            casio.turnOn();
            System.out.println(person2.getCalculator().add(58,77));
            System.out.println(person2.getCalculator().convertDecimalToBinary(85473));
            System.out.println("Circle " +person2.getCalculator().CalculateRectDiagonal(5, 10));
        }
        projectRectangle pr = new projectRectangle();
        pr.roots();

        FreeClass fc = new FreeClass();
        fc.sayNHello(12);
        fc.getEven(5);
        fc.setOfTask();

        System.out.println();  //odriadkovanie

    }

}