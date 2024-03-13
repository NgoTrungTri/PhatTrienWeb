
import com.ntt.pojo.Category;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class HibernateDemo {
    public static void main(String[] args) {
        try (Session s = HiberateUtils.getFactory().openSession()){
            Query q = s.createQuery("From Category");
            List<Category> cates = q.getResultList(); 
            
            cates.forEach(c -> System.out.println(c.getName()));
        } 
    }
}
