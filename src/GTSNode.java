public class GTSNode {
    private int x, y, id;
    private String name;

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GTSNode(){
        x = 0;
        y = 0;
        name = "";
        id = 0;
    }

    public GTSNode(int x, int y, String name, int id){
        this.x = x;
        this.y = y;
        this.name = name;
        this.id = id;
    }

    public GTSNode(GTSNode node){
        this.x = node.x;
        this.y = node.y;
        this.name = "";
        this.id = 0;
    }

    public void printCoordinates(){
        System.out.println(x);
        System.out.println(y);
    }
}
