//
//package probe.smallProject.Arbeitsprobe;
// 
//TEST1
//
//import org.springframework.stereotype.Component;
//
//import probe.smallProject.Model.Student;
//import probe.smallProject.Model.Subject;
//import probe.smallProject.Repository.StudentRepository;
//import probe.smallProject.Repository.SubjectRepository;
//import probe.smallProject.Service.StudentService;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import javax.transaction.Transactional;
//@Component
//public class Runner implements CommandLineRunner 
//{
//
//    private static final Logger logger = LoggerFactory.getLogger(Runner.class);
//
//    @Autowired(required=true)
//    private StudentRepository stdRepo;
//    
//    @Autowired(required=true)
//    private SubjectRepository sbjRepo;
//
//    @Override
//    @Transactional
//    public void run(String... args) throws Exception {
//
//        logger.info("initializing users");
//
//       /* Student std = new Student();
//        std.setName("EZZ");
//        stdRepo.save(std);
//        
//        Subject sbj1 =new Subject();
//        sbj1.setName("JAVA");
//        sbj1.setStudent(1L);
//        sbj1.setNote("Sehr_Gut");
//        sbjRepo.save(sbj1);
//        
//        Subject sbj2 =new Subject();
//        sbj2.setName("SPRING");
//        sbj2.setStudent(1L);
//        sbj2.setNote("Sehr_Gut");
//        sbjRepo.save(sbj2);
//        */
//       
//
//    }
//    
//}
