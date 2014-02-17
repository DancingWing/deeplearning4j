package com.ccc.deeplearning.scaleout.iterativereduce.multi;



import com.ccc.deeplearning.scaleout.iterativereduce.ComputableWorker;
/**
 * Worker for handling  subrows of a given set of matrix tasks.
 * Compute cycles are left to the user.
 * @author Adam Gibson
 *
 */
public abstract class ComputableWorkerImpl implements ComputableWorker<UpdateableImpl> {

	protected UpdateableImpl workerMatrix;

	

	@Override
	public UpdateableImpl getResults() {
		return workerMatrix;
	}

	@Override
	public void update(UpdateableImpl t) {
		this.workerMatrix = t;
	}

	

}
