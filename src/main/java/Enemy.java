public interface Enemy {

    // Describes how the enemy moves
    public void move();
    // Describes how the enemy transitions onto the screen
    public void transition();
    // Returns true if enemy is currently hit by Bullet
    public boolean isHit(Bullet b);

}
