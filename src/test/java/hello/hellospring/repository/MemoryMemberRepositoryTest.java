package hello.hellospring.repository;

import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {

     MemberRepository repository = new MemoryMemberRepository();
     @Test
     public  void save(){
          Member member = new Member();
          member.setName("spring")

     }
}
