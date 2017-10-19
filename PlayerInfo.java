//  Ray Kecham
//  CST-105
//  October 15 2017
//  Charles Lively
package Week5;
public class PlayerInfo {
    
	public String name;
	public int age;
	public double weight;
        public double height;
        public double rating;
	public int passingTouchDowns;
	public int rushingTouchDowns;
	public double rushingYards;
	public double passingYards;
        public int completions;

	public PlayerInfo() {
            }
	public PlayerInfo(String name, int age, double weight, double height, double rating, int passingTouchDowns, 
                        int rushingTouchDowns, double rushingYards, double passingYards, int completions) {
		this.name = name;
		this.age = age;
		this.weight = weight;
                this.height = height;
		this.rating = rating;
                this.passingTouchDowns = passingTouchDowns;
		this.rushingTouchDowns = rushingTouchDowns;
		this.rushingYards = rushingYards;
                this.passingYards = passingYards;
		this.completions = completions;
            }

	public String playerName() {
		return name;
            }
	public void playerName(String name) {
		this.name = name;
            }
	public int playerAge() {
		return age;
            }
	public void setAge(int age) {
		this.age = age;
            }
	public double playerWeight() {
		return weight;
            }
	public void setWeight(double weight) {
		this.weight = weight;
            }
        public double playerHeight() {
		return height;
            }
	public void setHeight(double height) {
		this.height = height;
            }
	public double playerRating() {
		return rating;
            }
        public void playerRating(double rating) {
		this.rating = rating;
	}
	public int playerPassingTouchDowns() {
		return passingTouchDowns;
            }
	public void setPassingTouchDowns(int passingTouchDowns) {
		this.passingTouchDowns = passingTouchDowns;
            }
	public double playerPassingYards() {
		return passingYards;
            }
	public void setPassingYards(int passingYards) {
		this.passingYards = passingYards;
            }
	public int playerRushingTouchDowns() {
		return rushingTouchDowns;
            }
	public void setRushingTouchDowns(int rushingTouchDowns) {
		this.rushingTouchDowns = rushingTouchDowns;
            }
        public double playerRushingYards() {
		return rushingYards;
            }
	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;
            }
        public int playerCompletions() {
		return completions;
            }

	public void setCompletions(int completions) {
		this.completions = completions;
            }
        
	public static void main(String[] args) {
		PlayerInfo ketcham = new PlayerInfo("Ray Ketcham", 23, 258, 70, 69.8, 4, 0, 1500, 456, 10);
		ketcham.setHeight(78);
		ketcham.setPassingTouchDowns(100);
		System.out.println("Ketcham has " + ketcham.playerPassingTouchDowns() + " passing touchdowns and player rating " + ketcham.playerRating()+ " % ");

            }
    }
