package com.team7.appointmentsystem.repository;

import com.team7.appointmentsystem.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {

    List<Comments> findTop5ByOrderByLocalDateTimeAsc();

}
