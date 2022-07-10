package array.medium;
//You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.
//
//        Implement the BrowserHistory class:
//
//        BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
//        void visit(string url) Visits url from the current page. It clears up all the forward history.
//        string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
//        string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
public class BrowserHistory {
    String homepage;

    public class Node {
        String val;
        Node prev;
        Node next;

        public Node(String val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    int counter = 0;


    public BrowserHistory(String homepage) {
        this.homepage =  homepage;
        Node node = new Node(homepage);
        head = node;
        tail = node;

    }


    public void visit(String url) {
        Node visitNode = new Node(url);
        tail.next = visitNode;
        visitNode.prev = tail;
        tail = tail.next;



    }



    public String back(int steps) {
        if(steps == 0) {
            return tail.val;
        }

        if(tail.prev == null) {

            return head.val;
        }

        while( tail != null) {

            counter++;

            if(counter == steps) {
                counter = 0;
                tail = tail.prev;
                return tail.val;
            }
            tail = tail.prev;

            if(tail.prev == null) {
                counter = 0;
                tail = head;
                return tail.val;
            }

        }



        return "";
    }



    public String forward(int steps) {


        if(steps == 0) {
            return tail.val;
        }


        if(tail.next == null) {
            counter = 0;
            return tail.val;
        }

        while( tail != null) {

            counter++;

            if(counter == steps) {
                counter = 0;
                tail = tail.next;
                return tail.val;
            }
            tail = tail.next;

            if(tail.next == null) {
                counter = 0;
                return tail.val;
            }


        }

        return "BN";
    }
}
