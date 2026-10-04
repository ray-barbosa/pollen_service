package com.example.api.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Entity
public class UserRepository implements JpaRepository<UserRepository, Long> {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends UserRepository> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserRepository> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<UserRepository> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserRepository getOne(Long aLong) {
        return null;
    }

    @Override
    public UserRepository getById(Long aLong) {
        return null;
    }

    @Override
    public UserRepository getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UserRepository> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserRepository> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends UserRepository> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends UserRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserRepository> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserRepository> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UserRepository, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends UserRepository> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserRepository> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<UserRepository> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<UserRepository> findAll() {
        return List.of();
    }

    @Override
    public List<UserRepository> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(UserRepository entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserRepository> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<UserRepository> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<UserRepository> findAll(Pageable pageable) {
        return null;
    }
}
