package com.nhn.pinpoint.web.service;

import java.util.List;

import com.nhn.pinpoint.web.applicationmap.ApplicationMap;
import com.nhn.pinpoint.web.filter.Filter;
import com.nhn.pinpoint.web.vo.*;

/**
 * @author netspider
 * @author emeroad
 */
public interface FilteredMapService {

	public LimitedScanResult<List<TransactionId>> selectTraceIdsFromApplicationTraceIndex(String applicationName, Range range, int limit);
	
	public LimitedScanResult<List<TransactionId>> selectTraceIdsFromApplicationTraceIndex(String applicationName, SelectedScatterArea area, int limit);

	public LoadFactor linkStatistics(Range range, List<TransactionId> traceIdSet, Application sourceApplication, Application destinationApplication, Filter filter);

	public ApplicationMap selectApplicationMap(List<TransactionId> traceIdList, Range originalRange, Range scanRange, Filter filter);

	public ApplicationMap selectApplicationMap(TransactionId transactionId);
}