import java.util.*;
import java.util.LinkedList;

public class Main {

    public enum ENU{
        ONE,TWO,THREE,FOUR;
    }

    public static void main(String [] args){

        //ITERATORS
        //iterator is used to loop through collections using next
        Set<String> hsSet = new HashSet<>();
        hsSet.addAll(Arrays.asList(new String [] {"a","b","c"}));
        Iterator<String> itSet = hsSet.iterator();
        while (itSet.hasNext()){                //check if collection still have a content
            System.out.println(itSet.next());   //get the element using next method
        }

        //List iterator
        //list iterator is only used for "List" collections
        ArrayList<String> aL = new ArrayList();
        aL.addAll(Arrays.asList(new String [] {"a","b","c","d"}));
        ListIterator lIt = aL.listIterator();
        while (lIt.hasNext()){
            System.out.println(lIt.next());
        }
        while(lIt.hasPrevious()){                   //you can use hasPrevious too loop back
            System.out.println(lIt.previous());     //use previous to get the element while looping back
        }

        // Returns the previous element index
        //  or -1 if the list iterator is at the
        // beginning of the list
        System.out.println(lIt.previousIndex());
        // Returns the next element index
        // or list size if the list iterator
        // is at the end of the list
        System.out.println(lIt.nextIndex());

        //////////////////////////////////////////////////////////////////////////////
        //QUEUE
        //First In First Out(FIFO)
        Queue<String> q = new LinkedList<String>();
        q.add("A");
        q.add("B");
        q.add("C");
        System.out.println(q.peek());       //returns the first item inserted
        System.out.println(q.element());
        System.out.println(q.remove());
        System.out.println(q.poll());

        //Deque
        //short for double ended queues
        Deque<String > dQ = new LinkedList<String>();
        dQ.add("A");
        dQ.addFirst("B");                   //can add/remove first
        dQ.addLast("C");                    //can add/remove last
        System.out.println(dQ.offer("D"));
        Iterator itDq = dQ.iterator();
        while(itDq.hasNext()){
            System.out.println(itDq.next());
        }

        //Priority Queue
        //can only contain comparable objects
        PriorityQueue<String> pQ = new PriorityQueue<String>();
        int [] arr = new int[] {1,2,3};
        String [] strs = new String[] {"BC","C","BC"};
        pQ.addAll(Arrays.asList(strs));
        Iterator itpQ = pQ.iterator();
        while (itpQ.hasNext()){
            System.out.println(itpQ.next()); //return the value with highest priority (ascending)
        }

        //////////////////////////////////////////////////////////////////////////////
        //LISTS//

        //ArrayList
        //dynamic size array

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(new String []{"a","b","c"}) ); //you can add items
        arrayList.remove("b"); //remove items
        System.out.println(arrayList);

        //LinkedList
        //in order according to the sequence of inserting elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(new String []{"b","d","c"}) ); //you can add items
        System.out.println(linkedList);

        //Stack
        //Last in First Out(LIFO)
        Stack<String>  st = new Stack<String>();
        st.push("A");
        st.push("B");
        st.push("C");
        System.out.println(st.peek());              //peek to return the last item inserted
        System.out.println(st.empty());             //check if empty
        System.out.println(st.search("C"));     //search the value in stack
        System.out.println(st.peek());
        System.out.println(st.pop());              //return and remove first item
        System.out.println(st.peek());

        //////////////////////////////////////////////////////////////////////////////
        //MAPS//

        //HashMap
        //collection that has a key index
        HashMap<String,Integer> hM = new HashMap<String, Integer>();
        hM.put("A",10);                         //use put to put value: key,value
        hM.put("B",20);
        hM.put("C",30);
        hM.put("D",40);
        hM.remove("B");
        hM.put("E",50);
        System.out.println(hM);
        for (Map.Entry m: hM.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
        System.out.println(hM.get("C"));
        hM.replace("B",40);
        System.out.println(hM.get("B"));

        //LinkedHashMaps
        //in order according to the sequence of inserting elements
        LinkedHashMap<String,Integer> lHM = new LinkedHashMap<String, Integer>();
        lHM.put("A",10);
        lHM.put("B",20);
        lHM.put("C",30);
        lHM.remove("C");
        lHM.put("D",40);
        System.out.println(lHM);

        //TreeMap
        //sorts the order of the map
        //unique elements
        //cannot store null values
        TreeMap<String,Integer> tM = new TreeMap<String, Integer>();
        tM.put("D",2);
        tM.put("C",3);
        tM.put("B",2);
        System.out.println(tM);

        //EnumMap
        //only stores enum
        EnumMap<ENU, Integer> enu = new EnumMap<ENU, Integer>(ENU.class);
        enu.put(ENU.ONE, 1);
        enu.put(ENU.FOUR, 4);
        enu.put(ENU.THREE, 3);
        System.out.println(enu);

        //////////////////////////////////////////////////////////////////////////////
        //SETS//

        //HashSet
        //cannot store same value
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {0,5,9,4,6,8,3}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {0,2,9,5,9,7,4}));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        Set<Integer> retain = new HashSet<>(a);
        retain.retainAll(b);
        System.out.println(retain);

        Set<Integer> remove = new HashSet<>(a);
        remove.removeAll(b);
        System.out.println(remove);

        //LinkedHashSet
        //in order according to the sequence of inserting elements
        Set<String> lhSet = new LinkedHashSet<>();
        lhSet.add("a");
        lhSet.add("c");
        lhSet.add("b");
        lhSet.add("a");
        System.out.println(lhSet);

        //TreeSet
        //sorts the order of the map
        //unique elements
        TreeSet<String> tS = new TreeSet<>();
        tS.add("B");
        tS.add("A");
        tS.add("C");
        System.out.println(tS);
        System.out.println(tS.headSet("C"));
        System.out.println(tS.tailSet("A"));
        System.out.println(tS.subSet("A","C"));

        //EnumSet
        //only stores enum
        EnumSet<ENU> set1, set2, set3, set4;
        // add elements
        set1 = EnumSet.of(ENU.ONE, ENU.TWO, ENU.THREE);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(ENU.class);
        set4 = EnumSet.range(ENU.ONE, ENU.THREE);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);

    }
}
