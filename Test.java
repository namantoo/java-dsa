
import java.util.*;


public class Test {
    // function to add
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    //function to swap
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num 1:" + num1 + "\nnum2:" + num2);
    }

    public static void main(String args[])
    {
        // Test obj = new Test();
        // // to call sum
        // int result = obj.sum(2,3);
        // // to call swap 
        // obj.swap(3, 4);
        // System.out.println(result);
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Rakesh");
        studentsName.add("Vinod");
        studentsName.add("Vinod");
        System.out.println(studentsName);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(223);
        
        list.add(2,3243);
        list.remove(Integer.valueOf(3243));
        System.out.println(list.contains(2143432));
        System.out.println(list);
        System.out.println(list.get(2));
        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for(Integer element: list){
            System.out.println(element);
        }
        //stack practice
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("deer");
        animals.push("dyuti");
        System.out.println("stack: " + animals.peek()); 
        System.out.println("Queue & Linked List: \n" );
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(122);

        queue.offer(1232234);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);





    }
}