public class GTSLine {
    private GTSNode startNode;
    private GTSNode finishNode;

    public int getTVP() {
        return TVP;
    }

    public void setTVP(int TVP) {
        if (TVP >= 0) {
            this.TVP = TVP;
        }
    }

    private int TVP;

    public GTSNode getStartNode() {
        return startNode;
    }

    public void setStartNode(GTSNode startNode) {
        this.startNode = startNode;
    }

    public GTSNode getFinishNode() {
        return finishNode;
    }

    public void setFinishNode(GTSNode finishNode) {
        this.finishNode = finishNode;
    }
}
