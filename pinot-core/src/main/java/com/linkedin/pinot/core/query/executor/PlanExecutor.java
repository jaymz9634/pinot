package com.linkedin.pinot.core.query.executor;

import com.linkedin.pinot.common.request.BrokerRequest;
import com.linkedin.pinot.common.response.InstanceResponse;
import com.linkedin.pinot.core.query.planner.QueryPlan;


/**
 * Given a query and query plan, different strategy may apply based on the query type.
 * 
 * @author Xiang Fu <xiafu@linkedin.com>
 *
 */
public interface PlanExecutor {
  public InstanceResponse ProcessQueryBasedOnPlan(final BrokerRequest query, QueryPlan queryPlan) throws Exception;

  void shutDown();
}