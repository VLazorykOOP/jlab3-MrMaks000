public class Main {

    public static void main(String[] args) {
        System.out.println(" Lab 3");
	// write your code here
        Task1();
        Task2();
        Task3();
    }

    private static void Task1() {
        System.out.println(" Task 1");
        Trial array[] = new Trial[4];

        array[0] = new Trial(10);
        array[1] = new Test(10, 10);
        array[2] = new Exam(10, 10, 2);
        array[3] = new FinalExam(10, 10);

        for (var item: array) {
            item.passingTheTest(4);
        }

        for (var item: array) {
            System.out.println(item.show() + "\n");
        }
    }

    private static void Task2() {
        System.out.println(" Task 2");
        int []array = {1 ,3 ,5 ,2 ,3, 2};
        Container []containerArray = new Container[2];

        containerArray[0] = new Choice(array);
        containerArray[1] = new Bubble(array);

        System.out.println(containerArray[0].equals(containerArray[1]));

        containerArray[0].sort();
        containerArray[1].sort();

        System.out.println(containerArray[0].equals(containerArray[1]));

        System.out.println(containerArray[0].norma());
        System.out.println(containerArray[1].norma());

        System.out.println(containerArray[0].toString());
        System.out.println(containerArray[1].toString());
    }

    private static void Task3() {
        System.out.println("\n Task 3");
        int []array = {1 ,3 ,5 ,2 ,3, 2};
        Container2 []containerArray2 = new Container2[3];

        containerArray2[0] = new Choice2(array);
        containerArray2[1] = new Choice2(array);
        containerArray2[2] = new Bubble2(array);

        System.out.println(containerArray2[0].equals(containerArray2[1]));

        containerArray2[0].sort();
        containerArray2[2].sort();

        System.out.println(containerArray2[0].equals(containerArray2[1]));
        System.out.println(containerArray2[0].equals(containerArray2[2]));

        System.out.println(containerArray2[0].norma());
        System.out.println(containerArray2[2].norma());

        System.out.println(containerArray2[0].toString());
        System.out.println(containerArray2[2].toString());
    }
}






