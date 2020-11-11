package com.wavefront.labs.convert.converter.grafana.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GrafanaPanelTarget {

	private boolean hide;
	private int refCount;
	private String refId;
	private String target;
	private String targetFull;
	private String expr;
	private String query;
	private String format;
	private String interval;
	private int intervalFactor;
	private boolean textEditor;

	public boolean isHide() {
		return hide;
	}

	public void setHide(boolean hide) {
		this.hide = hide;
	}

	public int getRefCount() {
		return refCount;
	}

	public void setRefCount(int refCount) {
		this.refCount = refCount;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getTargetFull() {
		return targetFull;
	}

	public void setTargetFull(String targetFull) {
		this.targetFull = targetFull;
	}

	public boolean isTextEditor() {
		return textEditor;
	}

	public void setTextEditor(boolean textEditor) {
		this.textEditor = textEditor;
	}

	public String getExpr() {
		return expr;
	}

	public void setExpr(String expr) {
		this.expr = expr;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public int getIntervalFactor() {
		return intervalFactor;
	}

	public void setIntervalFactor(int intervalFactor) {
		this.intervalFactor = intervalFactor;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
}
