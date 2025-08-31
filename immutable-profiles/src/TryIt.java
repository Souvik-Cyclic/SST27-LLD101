import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p1 = svc.createMinimal("u1", "a@b.com");
        System.out.println("Minimal: " + p1.getId() + ", " + p1.getEmail());

        UserProfile p2 = svc.createFull("u2", "b@c.com", "User Two");
        System.out.println("Full: " + p2.getId() + ", " + p2.getEmail() + ", " + p2.getDisplayName());
        // System.out.println("Before: " + p.getEmail());
        // p.setEmail("evil@example.com"); // demonstrates mutability problem
        // System.out.println("After:  " + p.getEmail());
        // System.out.println("=> In the solution, this setter disappears and object becomes immutable.");
    }
}
