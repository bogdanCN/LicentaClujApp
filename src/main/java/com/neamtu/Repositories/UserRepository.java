package com.neamtu.Repositories;

import com.neamtu.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Neamtu on 1/19/17.
 */
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByUserEmailLike(String useremail);
}
