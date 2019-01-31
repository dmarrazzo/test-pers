package utils;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.internal.runtime.Cacheable;

public class TracingListner implements ProcessEventListener, Cacheable {

	@Override
	public void beforeProcessStarted(ProcessStartedEvent event) {
		System.out.format("Process %s started with the id %d\n", event.getProcessInstance().getProcessName(),
				event.getProcessInstance().getId());
	}

	@Override
	public void afterProcessStarted(ProcessStartedEvent event) {
	}

	@Override
	public void beforeProcessCompleted(ProcessCompletedEvent event) {
	}

	@Override
	public void afterProcessCompleted(ProcessCompletedEvent event) {
		System.out.format("Process %s completed instance id %d\n", event.getProcessInstance().getProcessName(),
				event.getProcessInstance().getId());
	}

	@Override
	public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
		System.out.format("Node id %d name %s triggered\n", event.getNodeInstance().getId(),
				event.getNodeInstance().getNodeName());
	}

	@Override
	public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
	}

	@Override
	public void beforeNodeLeft(ProcessNodeLeftEvent event) {
	}

	@Override
	public void afterNodeLeft(ProcessNodeLeftEvent event) {
	}

	@Override
	public void beforeVariableChanged(ProcessVariableChangedEvent event) {
	}

	@Override
	public void afterVariableChanged(ProcessVariableChangedEvent event) {
		System.out.format("Variable %s = %s\n", event.getVariableId(), event.getNewValue());
	}

	@Override
	public void close() {
	}

}
