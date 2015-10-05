class ListController < ApplicationController
  def index
  	# @previous_name = cookies[:name]
  	# @name = params[:inputted_name]
  	# cookies[:name] = @name

  	# retrieve items from session
  	@items = session[:items]

  	# if not items, create array
  	unless @items
  		@items = []
  	end

  	# add the item sent by form if it exists
  	if params[:item] and params[:item].present?
  		@items.unshift(params[:item])
  	end

  	# update the session items
  	session[:items] = @items
  end
end
