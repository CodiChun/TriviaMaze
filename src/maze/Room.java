package maze;

// Create the room for the Maze
public class Room {

    // Create the doors of 4 direction
    private Door northDoor;
    private Door southDoor;
    private Door eastDoor;
    private Door westDoor;
    boolean exitRoom = false;


    // Getter and setter of the door on the North
    public Door getNorthDoor() {
        return northDoor;
    }

    public void setNorthDoor(Door northDoor) {
        this.northDoor = northDoor;
    }

    // Getter and setter of the door on the South
    public Door getSouthDoor() {
        return southDoor;
    }

    public void setSouthDoor(Door southDoor) {
        this.southDoor = southDoor;
    }

    // Getter and setter of the door on the East
    public Door getEastDoor() {
        return eastDoor;
    }

    public void setEastDoor(Door eastDoor) {
        this.eastDoor = eastDoor;
    }

    // Getter and setter of the door on the West
    public Door getWestDoor() {
        return westDoor;
    }

    public void setWestDoor(Door westDoor) {
        this.westDoor = westDoor;
    }

    // Set exit room --> Win the game if can enter to this room
    public boolean isExitRoom() {
        return exitRoom;
    }
    public void setExit() {
        this.exitRoom = true;
    }

    // lock the door
    public void lockNorth() {
        this.northDoor.lock();
    }
    public void lockSouth() {
        this.southDoor.lock();
    }
    public void lockWest() {
        this.westDoor.lock();
    }
    public void lockEast() {
        this.eastDoor.lock();
    }

    // Create the walls of 4 direction
    private Door northWall;
    private Door southWall;
    private Door eastWall;
    private Door westWall;

    public Door getNorthWall() {
        return northWall;
    }

    public void setNorthWall(Door northWall) {
        this.northWall = northWall;
    }

    public Door getSouthWall() {
        return southWall;
    }

    public void setSouthWall(Door southWall) {
        this.southWall = southWall;
    }

    public Door getEastWall() {
        return eastWall;
    }

    public void setEastWall(Door eastWall) {
        this.eastWall = eastWall;
    }

    public Door getWestWall() {
        return westWall;
    }

    public void setWestWall(Door westWall) {
        this.westWall = westWall;
    }

    // lock the wall
    public void lockNorthWall() {
        this.northWall.lock();
    }
    public void lockSouthWall() {
        this.southWall.lock();
    }
    public void lockWestWall() {
        this.westWall.lock();
    }
    public void lockEastWall() {
        this.eastWall.lock();
    }
}