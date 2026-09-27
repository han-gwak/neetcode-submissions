class BrowserHistory {

    public List<String> histories = new LinkedList<>();
    public int index = 0;

    public BrowserHistory(String homepage) {
        histories.add(homepage);
    }
    
    public void visit(String url) {
        
        System.out.println("+visit");
        index++;
    
        if (index < histories.size()) {
            System.out.println("Replacing forward history ;  sublist index = " + index + " trueSize = " + histories.size());
            histories = histories.subList(0, index);
        }
        histories.add(url);
        
    }
    
    public String back(int steps) {
        System.out.println("+back " + steps);
        System.out.println(" index = " + index);
        if (steps > index) {
            index = 0;
        } else {
            index -= steps;
        }
        return histories.get(index);
    }
    
    public String forward(int steps) {
        System.out.println("+forward " + steps);
        System.out.println("  index = " + index);

        if (index + steps >= histories.size()) {
            index = histories.size() - 1;
        } else {
            index += steps;
        }
        return histories.get(index);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */