package com.autumn.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autumn.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
