/*Write a program to perform addition of two polynomial equations using 
appropriate data structure.*/
class Node{
    int number;
    int power;
    Node link;
    public Node(int number,int power){
        this.number = number;
        this.power = power;
        link = null;
    }
}
class Polynomial {
    Node FIRST = null;
    public void displayPolynomial(){
        if(FIRST == null){
            System.out.println("Polynomial does not exist.");
            return;
        }
        Node temp = FIRST;
        while (temp != null) {
            if(temp.power == 0){
                System.out.print(temp.number);
            }else if(temp.power == 1){
                System.out.print(temp.number+"x");
            }else{
                System.out.print(temp.number+"x^"+temp.power);
            }
            if(temp.link != null){
                System.out.print(" + ");
            }
            temp = temp.link;
        }
        System.out.println();
    }
    public void insertATermAtLast(int number ,int power){
        Node newNode = new Node(number , power);
        if(FIRST == null){
            FIRST = newNode;
            return;
        }
        Node temp = FIRST;
        while (temp.link != null){
            temp = temp.link;
        }
        temp.link = newNode;
    }
    public void DeleteATermAtPosition(int pos){
        if(FIRST == null){
            System.out.println("Polynomial does not exist.");
            return;
        }
        if(pos == 1){
            FIRST = FIRST.link;
            return;
        }
        Node temp = FIRST;
        int count = 1;
        while (temp.link != null && count != pos - 1){
            temp = temp.link;
            count++;
        }
        temp.link = (temp.link).link;
    }
}
public class DS_LAB_76 {    
    public static void main(String[] args) {
        System.out.println("p1 = ");
        Polynomial p1 = new Polynomial();
        //2x^2+4x+1
        p1.insertATermAtLast(2,2);
        p1.insertATermAtLast(4,1);
        p1.insertATermAtLast(1,0);
        p1.displayPolynomial();

        System.out.println("p2 = ");
        Polynomial p2 = new Polynomial();
        //4x^2+6x+7
        p2.insertATermAtLast(4,2);
        p2.insertATermAtLast(6,1);
        p2.insertATermAtLast(7,0);
        p2.displayPolynomial();

        System.out.println("p3 = ");
        Polynomial p3 = new Polynomial();
        //5x^2+5
        p3.insertATermAtLast(5,2);
        p3.insertATermAtLast(5,0);
        p3.displayPolynomial();

        System.out.println("p1 + p2 = ");
        Polynomial res = addPolynomial(p1, p2);
        res.displayPolynomial();

        System.out.println("p2 + p1 = ");
        res = addPolynomial(p2, p1);
        res.displayPolynomial();

        System.out.println("p1 + p3 = ");
        res = addPolynomial(p1, p3);
        res.displayPolynomial();

        System.out.println("p1 + null = ");
        res = addPolynomial(p1, null);
        res.displayPolynomial();
    }
    public static Polynomial addPolynomial(Polynomial p1,Polynomial p2){
        if(p1 == null && p2 == null){
            return null;
        }
        if(p1 == null && p2 != null){
            return p2;
        }
        if(p1 != null && p2 == null){
            return p1;
        }
        Node temp1 = p1.FIRST;
        Node temp2 = p2.FIRST;
        Polynomial res = new Polynomial();
        while(temp1 != null || temp2 != null){
            if(temp1.power == temp2.power){
                res.insertATermAtLast(temp1.number+temp2.number,temp1.power);
                temp1 = temp1.link;
                temp2 = temp2.link;
            }else if(temp1.power > temp2.power){
                res.insertATermAtLast(temp1.number,temp1.power);
                temp1 = temp1.link;
            }else if(temp1.power < temp2.power){
                res.insertATermAtLast(temp2.number,temp2.power);
                temp2 = temp2.link;
            }
        }
        return res;
    }
}
