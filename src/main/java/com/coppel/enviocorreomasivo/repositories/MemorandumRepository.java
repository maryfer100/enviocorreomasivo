package com.coppel.enviocorreomasivo.repositories;

        import com.coppel.enviocorreomasivo.entities.Memorandum;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
 public interface MemorandumRepository extends JpaRepository<Memorandum,String> {
    @Query(value = "SELECT fun_generamemos_masivos AS iContador FROM fun_generamemos_masivos(?1,?2,?3,?4);",nativeQuery = true)
    String getContador(Integer emporigen,Integer centro,String sAsunto,String sTextoMemo);
}
