/*
 * Copyright 2000-2011 Enonic AS
 * http://www.enonic.com/license
 */
package com.enonic.cms.business.core.security.userstore.connector;

import com.enonic.cms.domain.security.group.DeleteGroupCommand;
import com.enonic.cms.domain.security.group.GroupEntity;
import com.enonic.cms.domain.security.group.GroupKey;
import com.enonic.cms.domain.security.group.StoreNewGroupCommand;
import com.enonic.cms.domain.security.group.UpdateGroupCommand;
import com.enonic.cms.domain.security.user.DeleteUserCommand;
import com.enonic.cms.domain.security.user.StoreNewUserCommand;
import com.enonic.cms.domain.security.user.UpdateUserCommand;
import com.enonic.cms.domain.security.user.User;
import com.enonic.cms.domain.security.user.UserEntity;
import com.enonic.cms.domain.security.user.UserKey;

public interface UserStoreConnector
{
    boolean canCreateUser();

    boolean canUpdateUser();

    boolean canUpdateUserPassword();

    boolean canDeleteUser();

    boolean canCreateGroup();

    boolean canReadGroup();

    boolean canUpdateGroup();

    boolean canDeleteGroup();

    String authenticateUser( final String uid, final String password );

    void changePassword( final String uid, final String newPassword );

    UserKey storeNewUser( final StoreNewUserCommand command );

    GroupKey storeNewGroup( final StoreNewGroupCommand command );

    void updateUser( final UpdateUserCommand command );

    void updateGroup( final UpdateGroupCommand command );

    void deleteUser( final DeleteUserCommand command );

    void deleteGroup( final DeleteGroupCommand command );

    User getUserByEntity( UserEntity userEntity );

    void removeMembershipFromGroup( GroupEntity groupToRemove, GroupEntity groupToRemoveFrom );

    void addMembershipToGroup( GroupEntity groupToAdd, GroupEntity groupToAddTo );
}