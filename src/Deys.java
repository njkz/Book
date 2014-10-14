import java.util.Scanner;


public class Deys {
    public Address[] list = new Address[0];
    public int[] q = new int[0];

    public void Add(Address newa) {
        Address[] newlist = new Address[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newlist[i] = list[i];
        }
        newlist[newlist.length - 1] = newa;
        list = newlist;
    }

    public int[] find(String name) {
        int j = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].name.equals(name)) {
                int[] w = new int[q.length + 1];
                for (int k = 0; k < q.length; k++) {
                    w[k] = q[k];
                }
                w[j] = i;
                j++;
                System.out.println(i+") Имя: "+list[i].name+" Телефон: "+list[i].phone+" Email: "+list[i].email);
                q = w;
            }
        }
        if (q.length==0){
            System.out.println("Человека с таким именем в книге нет");
        }
        return q;
    }

    public Address get(int index) {
        return list[index];
    }


    public void delete(int index) {
        if (index<list.length) {
            Address[] newlist = new Address[list.length - 1];
            int j = 0;
            for (int i = 0; i < list.length; i++) {
                if (i == index) continue;
                newlist[j] = list[i];
                j++;
            }
            list = newlist;
        }
        else System.out.println("Элемента с таким индексом нет");
    }


    public int gecCount() {
        return list.length;
    }
    public void ollpr(){
        for (int i=0;i<list.length;i++){
            System.out.println(i+") Имя: "+list[i].name+" Телефон: "+list[i].phone+" Email: "+list[i].email);
        }
    }
}
