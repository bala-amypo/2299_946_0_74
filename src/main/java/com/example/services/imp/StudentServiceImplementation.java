import com.example.demo.entit.Student;
import com.example.demo.reposistory.StudentReposistory;
import com.example.demo.service.StudentService;
import org.springframe.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    StudentReposistory repo;

    @Override
    //create (or) Insert data
    public Student createData(Student stu){
        return repo.save(stu);
    }

    @Override
    //fetch all records
    public List<Student> fetchRecord(){
        return repo.finaAll();
    }
}