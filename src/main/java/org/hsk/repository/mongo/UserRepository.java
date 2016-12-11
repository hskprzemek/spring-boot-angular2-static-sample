package org.hsk.repository.mongo;

import org.hsk.model.mongo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by cartman on 11.12.16.
 */
public interface UserRepository extends PagingAndSortingRepository<User, String> {
}
