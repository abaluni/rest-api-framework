package com.arun.framework.requestexecutor;

public enum RequestType {

	/**
	 * This Enum will be used to create object of specified requestType.
	 */
	POST {
		@Override
		public ExecuteRequestInterface CreateHttpMethodObject() {
			//To Do - Write Function for POST Request
			return new GetRequest();
		}
	},
	PUT {
		@Override
		public ExecuteRequestInterface CreateHttpMethodObject() {
			//To Do - Write Function for PUT Request
			return new GetRequest();
		}
	},
	GET {
		@Override
		public ExecuteRequestInterface CreateHttpMethodObject() {
			return new GetRequest();
		}

	},

	DELETE {
		@Override
		public ExecuteRequestInterface CreateHttpMethodObject() {
			//To Do - Write Function for DELETE Request
			return new GetRequest();
		}
	};
	
	abstract ExecuteRequestInterface CreateHttpMethodObject();
}
