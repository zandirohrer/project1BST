//Alexander Rohrer

public class dam{
    String name;
    String Fsc;
    String level;
    
    public dam(String n, String x, String y){
        name = n;
        Fsc = x;
        level = y;
        int levelInt = Integer.parseInt(level);
    }
    
    public string toString(){
        return "Dam name: " + name + "FSC: " + Fsc + "level: " + level;
    }
}