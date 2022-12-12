package StackQueueStudy;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("4");
        st.push("44");
        st.push("444");


        int idx = st.search("444");
        System.out.println("idx = " + idx);
    }
}
