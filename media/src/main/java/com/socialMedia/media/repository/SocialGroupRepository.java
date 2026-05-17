package com.socialMedia.media.repository;


import com.socialMedia.media.models.SocialGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialGroupRepository extends JpaRepository<SocialGroup, Long> {
}
