public class Admin extends User{
    public Admin(String id) {
        super(id);
    }
    public User createUser(String id){
        return new User(id);
    }
    public void manageQueue(){
        // TODO: delete song from the queue
    }
}
