class shape{
    int x,y;
    void getCoord(int x,int y){
        this.x=x;
        this.y=y;
    }
    void showCord(){
	System.out.println("x: "+x+"\ny: "+y);
    }
}


class rect extends shape{
    int l,b;
    void showCord(int l,int b){
	System.out.println("Length: "+l+"\nBreadth: "+b);
    }
}


class JavaPractical_26{
    public static void main(String args[]){
    	rect r=new rect();
    	r.getCoord(4,5);
    	r.showCord();
	r.showCord(2,7);
    }
}