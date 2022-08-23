package org.khasanof;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class UserSpecification {
    public static class AgeBetweenSpec implements Specification<User> {

        private final int from;

        private final int to;

        public AgeBetweenSpec(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
            return cb.between(root.get("age"), from, to);
        }

    }

    /**
     * Name specification.
     */
    public static class NameEqualSpec implements Specification<User> {

        public final String name;

        public NameEqualSpec(String name) {
            this.name = name;
        }

        /**
         * Get predicate.
         */
        @Override
        public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
            return cb.equal(root.get("name"), this.name);
        }
    }
}
