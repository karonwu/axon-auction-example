/*
 * Copyright (c) 2010. Axon Auction Example
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fuin.auction.command.api;

import javax.validation.constraints.NotNull;

/**
 * Verify the user with a given security token.
 */
public final class VerifyUserCommand implements Command {

	private static final long serialVersionUID = 7178665113651928567L;

	private static final int VERSION = 1;

	@NotNull
	// TODO michael 20.10.2010 Create a validator for aggregateId
	private String userAggregateId;

	@NotNull
	private String securityToken;

	/**
	 * Default constructor.
	 */
	public VerifyUserCommand() {
		super();
	}

	/**
	 * Constructor with all attributes.
	 * 
	 * @param userAggregateId
	 *            Aggregate id of the user.
	 * @param securityToken
	 *            Security token.
	 */
	public VerifyUserCommand(final String userAggregateId, final String securityToken) {
		super();
		this.userAggregateId = userAggregateId;
		this.securityToken = securityToken;
	}

	@Override
	public final int getVersion() {
		return VERSION;
	}

	/**
	 * Returns the aggregate id of the user.
	 * 
	 * @return Unique id.
	 */
	public final String getUserAggregateId() {
		return userAggregateId;
	}

	/**
	 * Sets the aggregate id of the user to a new value.
	 * 
	 * @param userAggregateId
	 *            Unique id to set.
	 */
	public final void setUserAggregateId(final String userAggregateId) {
		this.userAggregateId = userAggregateId;
	}

	/**
	 * Returns the security token.
	 * 
	 * @return Base64 encoded security token.
	 */
	public final String getSecurityToken() {
		return securityToken;
	}

	/**
	 * Sets the security token to a new value.
	 * 
	 * @param securityToken
	 *            Base64 encoded security token.
	 */
	public final void setSecurityToken(final String securityToken) {
		this.securityToken = securityToken;
	}

}
