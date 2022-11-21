package boot.startboot.repository;

import boot.startboot.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 데이터 클린
    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("sptring");

        repository.save(member);

    }

    @Test
    public void findById(){
        Member memeber1 = new Member();
        memeber1.setName("spring1");
        repository.save(memeber1);

        Member memeber2 = new Member();
        memeber2.setName("spring1");
        repository.save(memeber2);
        Member result = repository.findById(memeber1.getId()).get();
        //System.out.println("result = " + (result == member));

        // org.junit.jupiter.api.Assertions;
        //Assertions.assertEquals(result, new Member());

        //import org.assertj.core.api.Assertions;
        assertThat(memeber1).isEqualTo(result);
    }
    @Test
    public void findByName(){
        Member memeber1 = new Member();
        memeber1.setName("spring1");
        repository.save(memeber1);

        Member memeber2 = new Member();
        memeber2.setName("spring1");
        repository.save(memeber2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(memeber1);
    }

    @Test
    public void findAll(){
        Member memeber1 = new Member();
        memeber1.setName("spring1");
        repository.save(memeber1);

        Member memeber2 = new Member();
        memeber2.setName("spring1");
        repository.save(memeber2);

    }
}
